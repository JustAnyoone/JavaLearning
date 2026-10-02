package Exercices.Ex42_MinimumElement;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = readInteger(scanner);
        System.out.println(count);

        int[] arrayElements = readElements(scanner, count);
        System.out.println(Arrays.toString(arrayElements));

        int min = findMin(arrayElements);
        System.out.println(min);

        scanner.close();
    }

    private static int readInteger(Scanner scanner) {
        System.out.print("Enter count: ");
        return scanner.nextInt();
    }

    private static int[] readElements(Scanner scanner, int count) {
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            System.out.print((i + 1 ) + " Enter a number: ");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static int findMin(int[] array) {
        int cmv = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < cmv) {
                cmv = array[i];
            }
        }
        return cmv;
    }
}