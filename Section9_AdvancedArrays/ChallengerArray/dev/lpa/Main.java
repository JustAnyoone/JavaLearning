package Section9_AdvancedArrays.ChallengerArray.dev.lpa;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] firstArray = getRandomArray(5);
        System.out.println(Arrays.toString(firstArray) + " = Normal_Array");
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));
        int[] secondArray = getDescendingOrderArray(firstArray);
        System.out.println(Arrays.toString(secondArray));
    }

    private static int[] getRandomArray(int len) {

        Random random = new Random();
        int[] newInt = new int[len];
        for (int i = 0; i < len; i++){
            newInt[i] = random.nextInt(100); // 0-99
        }

        return newInt;
    }

    private static int[] getDescendingOrderArray(int array[]){

        int temp = 0;
        int[] orderArray = new int[array.length];
        orderArray = array;

        for (int pass = 0; pass < orderArray.length - 1; pass++){

            for(int i = 0; i < orderArray.length - 1 - pass; i++){

                if (orderArray[i] < orderArray[i + 1]) {
                temp = orderArray[i];
                orderArray[i] = orderArray[i + 1];
                orderArray[i + 1] = temp;

                }
            }

        }
        return orderArray;
    }
}
