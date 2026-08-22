package Section_5.MethodOverloading;

public class Main {
    public static void main(String[] args) {

        System.out.println("New score is " + calculateScore("Pedro", 500));
        System.out.println("New score is " + calculateScore(10));
        System.out.println("New score is " + calculateScore());
    }

    public static int calculateScore(String playerName, int score){

        System.out.println("Player " + playerName + " scored :"+ score + " points");
        return score * 100;
    }

    public static int calculateScore(int score){

        return calculateScore("Anonymous", score); //--> Dessa maneira fica mais organizado e evitando futuros problemas
        // System.out.println("Unnamed player scored" + score + " points"); 
        // return score * 1000;
    }

    public static int calculateScore()  {

        System.out.println("No player name, no player score.");
        return 0;
    }

}
