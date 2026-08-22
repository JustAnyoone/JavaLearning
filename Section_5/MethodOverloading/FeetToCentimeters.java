package Section_5.MethodOverloading;

// Little Glue = C1 inch = 2.54cm | one foot = 12 inches.
public class FeetToCentimeters {
    public static void main(String[] args) {
        
        System.out.println("(in 8, ft5)The value in centimeters is :" + String.format("%.2f", convertToCentimeters(8, 5)) + "cm");
        System.out.println("(in 68)The value in centimeters is :" + String.format("%.2f", convertToCentimeters(68)) + "cm");
        // -> No formatting in the teacher's example — adding it here
    }

    public static double convertToCentimeters (int inche){
        
        return inche * 2.54;
    }

    public static double convertToCentimeters (int inche, int foot){

        inche =+ (foot * 12);
        return convertToCentimeters(inche);
    }
    
}
