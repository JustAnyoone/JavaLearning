package Section_5.Exercises;

public class Exercise12 {
    public static void main(String[] args) {

        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
        System.out.println(isCatPlaying(true, 43));
    }

    public static boolean isCatPlaying(boolean summer, int temperature){
        // temperature => 25 && temperature temperature <=  35 
        // in summer the limit upper is 45

        int tempLimit = summer ? 45 : 35;

        return (temperature >= 25 && temperature <= tempLimit); 
        
    }
}
