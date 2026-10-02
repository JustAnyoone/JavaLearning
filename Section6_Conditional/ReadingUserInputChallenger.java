package Section6_Conditional;
import java.util.Scanner;

public class ReadingUserInputChallenger {
    public static void main(String[] args) {
        System.out.println( "The sum of all five numbers is: " + getInput());
    }

    public static int getInput(){
        Scanner scanner = new Scanner(System.in);

        int number = 0;
        int sum = 0;
        

        for (int i = 1; i <= 5; i++) {

            try {
                System.out.println("Enter number #"+ i +": "); 
                number = Integer.parseInt(scanner.nextLine());
                
            } catch (NumberFormatException badUserData) {
                System.out.println("Invalid number !!! Try again.");
                i--;
            }

            sum += number;
        }
        scanner.close();
        return sum;
    }
}
