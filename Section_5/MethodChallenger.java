package Section_5;

public class MethodChallenger {
    public static void main(String[] args) {
        
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);
        
        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Bob", highScorePosition);
        
        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Marley", highScorePosition);
        
        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Pedro", highScorePosition);
        
        highScorePosition = calculateHighScorePosition(25);
        displayHighScorePosition("Tim Maia", highScorePosition);
        
    }

    public static void displayHighScorePosition(String PlayerName, int PlayerScore) {
        System.out.println(PlayerName + " managed to get into position " + PlayerScore + " on the high score list");
    }

    public static int calculateHighScorePosition(int PlayerScore){
        if (PlayerScore >= 1000 ) {
            return 1;
        }
        else if (PlayerScore >= 500){
            return 2;
        }
        else if (PlayerScore >= 100){
            return 3;
        }
        
        return 4;
    }
      
}
