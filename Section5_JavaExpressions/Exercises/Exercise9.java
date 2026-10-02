package Section5_JavaExpressions.Exercises;
// AreaCalculator
public class Exercise9 {
    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(-1)); // <- (-1)
        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0, 4.0));
    }

    private static final int INVALID_VALUE = -1;

    public static double area(double radius){
        if (radius <0) {
            return INVALID_VALUE;
        }else {
            return (Math.PI * radius * radius);
        }
        
    }

    public static double area(double x, double y){
        if (x < 0 || y < 0) {
            return INVALID_VALUE;
        } else {
            return (x * y);
        }
        
    }
}
