public class Ex15_SumOddRange {
    public static void main(String[] args) {
        System.out.println(sumOdd(1, 100)); //→ should return 2500
        System.out.println(sumOdd(-1, 100)); //→ should return -1
        System.out.println(sumOdd(100, 100)); //→ should return 0
        System.out.println(sumOdd(13, 13)); //→ should return 13 
        System.out.println(sumOdd(100, -100)); //→ should return -1
        System.out.println(sumOdd(100, 1000)); //→ should return 247500
        
    }
    
    public static boolean isOdd(int number){

       return number > 0 && number % 2 != 0;
    }

    public static int sumOdd(int start, int end){
        
        if (start < 0 || end < 0) {
            return -1;
        } 

        int sumOddNumbers = 0; 
        for (int loopNumber = start; end >= loopNumber; loopNumber++){
            if ( isOdd(loopNumber)) {
                sumOddNumbers += loopNumber; 
            }
        } 
        return (sumOddNumbers); 
    }

   

}
