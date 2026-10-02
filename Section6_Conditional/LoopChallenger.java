package Section6_Conditional;

public class LoopChallenger {
    public static void main(String[] args) {

        // System.out.println("0 is " + (isPrime(0) ? "" : "NOT ") + "a prime number");
        // System.out.println("2 is " + (isPrime(2) ? "" : "NOT ") + "a prime number");
        // System.out.println("8 is " + (isPrime(8) ? "" : "NOT ") + "a prime number");
        // System.out.println("17 is " + (isPrime(17) ? "" : "NOT ") + "a prime number");
//--------------------------------------------------------------------------------------------------------
        // for(int number = 1; number <= 20; number++){
        //     System.out.println( number +" is a " +(isPrime(number) ? "" : "NOT ") + "a prime number" );
        // }
//--------------------------------------------------------------------------------------------------------
        int count = 0;

        for (int i = 10; i <= 50; i++){  // count < 3 && i <= 50;
            if (isPrime(i)) {
                System.out.println("number " + i + " is a prime number");
                count++;
                if (count == 3) {
                    System.out.println("Found 3 - Exiting for loop");
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int wholeNumber){
        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }

        for (int divisor =2; divisor <= wholeNumber / 2; divisor++){
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }

        return true;
    }

}
