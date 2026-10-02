package Section6_Conditional;

public class WhileLoopChallenger {
    public static void main(String[] args) {
        
        int number = 4;
        int finishNumber = 20;
        int evenCount = 0;
        int oddCount = 0;

        do {
            number++;
            if (!isEvenNumber(number)) {
                oddCount++;
                continue;
            }
            System.out.println("Even number " + number);
            evenCount++;
            if (evenCount >= 5) {
                break;
            }
        } while (number <= finishNumber); 

        System.out.println("Total odd numbers found = " + oddCount);
        System.out.println("Total even numbers found = " + evenCount);
    }
    public static boolean isEvenNumber(int number){

        return ((number % 2) == 0);

    }
}
//  int number = 0;
//         while(number < 50) {
//             number += 5;
//             if (number % 25 == 0) {
//                 continue;
//             }
//             System.out.print(number + "_");
//         }