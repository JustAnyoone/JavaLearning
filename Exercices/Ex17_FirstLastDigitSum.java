package Exercices;

public class Ex17_FirstLastDigitSum {
    public static void main(String[] args) {
        
    }

    public static int sumFirstAndLastDigit(int number){

        if (number < 0) {
            return -1;
        }

        int lastDigit = number % 10; //  %10 to get last digit 

        while (number >= 10) { 
            number /= 10;  // divide with 10 until there is 1 digit left (< 10) 
            // to get first digit.This is also equivalent to number = number / 10.
        }

        int firstDigit = number; 

        return firstDigit + lastDigit;
    }
}
