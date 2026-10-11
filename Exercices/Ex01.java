public class Ex01 {
    public static void main(String[] args) {
        int number = 0;
        checkValue(number);
    }
    public static void checkValue(int number){
        if(number > 0){
            System.out.println("Positive");
        }
        else if (number < 0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Zero");
        }
    }
}