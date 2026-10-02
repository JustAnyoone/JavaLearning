package Exercices;

public class Ex20_LastDigitChecker {
    public static void main(String[] args) {

        System.out.println(hasSameLastDigit (41, 22, 71)); //<- True
        System.out.println(hasSameLastDigit (23, 32, 42)); //<- True
        System.out.println(hasSameLastDigit (41, 22, 79)); //<- False
        System.out.println(hasSameLastDigit (9, 99, 999)); //<- False (notInRange)

    }

    public static boolean isValid(int number){
        return number >= 10 && number <= 1000;
    }

    public static boolean hasSameLastDigit(int first, int second, int third){

        if (!isValid(first) || !isValid(second) || !isValid(third)) {
            return false;
        }

        int firstLastDigit = first % 10;
        int secondLastDigit = second % 10;
        int thirdLastDigit = third % 10;

        boolean checked = (firstLastDigit == secondLastDigit) || (firstLastDigit == thirdLastDigit) || (secondLastDigit == thirdLastDigit);

        return checked;
    }
}
