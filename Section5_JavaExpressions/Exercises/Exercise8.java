package Section5_JavaExpressions.Exercises;
//TeenNumberChecker
public class Exercise8 {
    public static void main(String[] args) {
        System.out.println(hasTeen(9, 99, 19)); //true
        System.out.println(hasTeen(24, 15, 42)); //true
        System.out.println(hasTeen(22, 23, 34)); //false
    }

    public static boolean hasTeen(int a, int b, int c){
        
        return isTeen(a)|| isTeen(b) || isTeen(c);
    }

    public static boolean isTeen(int number) {
        return number > 12 && number <20;
    }
}
