package Exercices;

public class Ex24_NumberToWords {
    public static void main(String[] args) {
        //NumbersToWords method Example : 
        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);
        //=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=--
        // getDigitCount method Example : 
        // System.out.println(getDigitCount(0));
        // System.out.println(getDigitCount(123));
        // System.out.println(getDigitCount(-12));
        // System.out.println(getDigitCount(5200));
        //=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=--
        // reverse method Example : 
        // System.out.println(reverse(-121));
        // System.out.println(reverse(2121));
        // System.out.println(reverse(4321));
        // System.out.println(reverse(1));

    }

    public static void numberToWords(int number){

        if (number < 0) {
            System.out.println("Invalid Value");
        }

        int count = getDigitCount(number);
        int reverseCount = getDigitCount(reverse(number));
        number = reverse(number);


        int lastDigit = 0;
        int original = number;

        while (original != 0 ) {

            lastDigit = original % 10;
            original /= 10;

                switch (lastDigit) {
                
                case 0 -> System.out.println("ZERO ");
                case 1 -> System.out.println("ONE ");
                case 2 -> System.out.println("TWO ");
                case 3 -> System.out.println("THREE ");
                case 4 -> System.out.println("FOUR ");
                case 5 -> System.out.println("FIVE ");
                case 6 -> System.out.println("SIX ");
                case 7 -> System.out.println("SEVEN ");
                case 8 -> System.out.println("EIGHT ");
                case 9 -> System.out.println("NINE ");
                // default -> System.out.println("OTHER");
                
            };

        }

        while (count != reverseCount) {

            number = number * 10;
            reverseCount++;
            System.out.println("ZERO ");

        }        

    }
//-----------------------------------------------------------
    public static int reverse(int number){

        int reverse = 0;

        while (number != 0) {
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }

        return reverse;
    }
//------------------------------------------------------------
    public static int getDigitCount(int number){

        if (number < 0) {
            return -1;
        }

        if (number == 0) {
            return 1;
        }

        int count = 0;

        for(int i = 1; i<= number; i *= 10){
            count++;
        }

        return count;
    }

}
