package Section_5.Exercises;
// MinutesToYearsDaysCalculator
public class Exercise10 {
    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays (long minutes){

        if (minutes < 0) {
            System.out.println("Invalid Value");
        }
        else {
            int hours = (int) (minutes / 60);
            int days = (hours / 24);
            int years = (days / 365); 
            int remaingDays = (days % 365);
            System.out.println(minutes + " min = " + years + " y and " + remaingDays + " d");
        }
    }
}
