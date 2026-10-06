public class Ex16_NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221)); //< should return true
        System.out.println(isPalindrome(707)); // <-- should return true
        System.out.println(isPalindrome(11212)); // <-- sjould return false
    }

    public static boolean isPalindrome(int number){

        int reverse = 0;
        int original = number;
        while (original != 0) {
            reverse = reverse * 10 + original % 10;
            original /= 10;
        }
        return reverse == number;
    }
}
