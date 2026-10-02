package Section6_Conditional;

public class DigitSumChallenger {
    public static void main(String[] args) {
        System.out.println(sumDigits(2));     // <- return 2
        System.out.println(sumDigits(125));   // <- return 8
        System.out.println(sumDigits(1000));  // <- return 1
        System.out.println(sumDigits(1234)); // <- return 10
        System.out.println(sumDigits(-1));           // <- return -1
        
    }

    public static int sumDigits(int number){

        if (number < 0) {
            return -1;
        }

        int sum = 0;
        while (number > 0) {
            sum += (number % 10); // grab the last digit
            number /= 10;       // remove the last digit
        }

        return sum;
    }
}
