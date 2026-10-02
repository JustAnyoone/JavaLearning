package Section6_Conditional;
import java.util.Scanner;

public class ChallengerMinAndMax {
    public static void main(String[] args) {
        System.out.println(minAndMax());
    }

    public static String minAndMax(){
        Scanner scanner = new Scanner(System.in);

        int min = 0;
        int max = 0;
        int number = 0;
        boolean quit = false;

        do {

            try {
                System.out.println("the min number :"+ min);
                System.out.println("the max number :"+ max);
                System.out.println("Enter number a number, or any character to exit:"); 
                number = Integer.parseInt(scanner.nextLine());

                if (min > number || min == 0) {
                    min = number;
                }
                if (max < number || max == 0) {
                    max = number;
                }

            } catch (NumberFormatException nfe) {
                System.out.println("Quiting from the looping");
                quit = true;
            }

        } while (quit == false);

        scanner.close();
        return "The min number is:"+ min +", and the max number is:" + max;
    }

    
}
