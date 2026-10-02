package Section6_Conditional;

public class SwitchChallenger {
    public static void main(String[] args) {
        String letter = "P";

        System.out.println(natoAlphabet(letter));
    }

    public static String natoAlphabet(String letter){

        switch (letter) {
            case "A":
                return "A is Able";
            case "B":
                return "B is Baker";
            case "C":
                return "C is Charlie";
            case "D":
                return "D is Dog";
            case "E":
                return "E is Easy";
            default:
                return"Letter " + letter + " was not found in the switch";
        }
        
    }
}
