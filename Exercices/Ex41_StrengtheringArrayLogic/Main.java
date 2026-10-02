package Exercices.Ex41_StrengtheringArrayLogic;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] myArray = SortedArray.getIntegers(5);
        // SortedArray.printArray(myArray);
        int [] sortArray = SortedArray.sortIntegers(myArray);
        SortedArray.printArray(sortArray);
    }

    public class SortedArray {
    
        public static int[] getIntegers(int capacity) {
            
            Scanner scanner = new Scanner(System.in);
            int[] array = new int[capacity];
            System.out.println("Enter " + capacity + " integer values:\r");
            for (int i=0; i<array.length; i++) {
                array[i] = scanner.nextInt();
            }
            scanner.close();
            return array;
        }
    
        public static void printArray(int[] array) {
            
            for (int i=0; i<array.length; i++) {
                System.out.println("Element " + i + " contents " + array[i]);
            }
        }
    
        public static int[] sortIntegers(int[] array) {
    
            int[] sortedArray = Arrays.copyOf(array, array.length);
            boolean flag = true;
            int temp;

            while (flag) {
                flag = false;
                for (int i=0; i<sortedArray.length-1; i++) {
                    if (sortedArray[i] < sortedArray[i+1]) {
                        temp = sortedArray[i];                     // 1
                        sortedArray[i] = sortedArray[i+1];         // 2
                        sortedArray[i+1] = temp;                   // 3
                        flag = true;                               // 4
                    }
                }
            }

            return sortedArray;
        }
    }
}
