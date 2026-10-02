package Section5_JavaExpressions.Exercises;
// Decimal Comparator
public class Exercise6 {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175)); // true
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));    // false
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));        // true
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));   // false
    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        long truncated1 = (long) (num1 * 1000); //<-- long instead Int, because of the lenght
        long truncated2 = (long) (num2 * 1000);

        return truncated1 == truncated2; //<-- Condition 

    }
}
