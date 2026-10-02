package Exercices;

public class Ex25_FlourPacker {
    public static void main(String[] args) {

        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 2, 11));
        System.out.println(canPack(-3, 2, 12));

    }

        private static final int BIG_WEIGHT = 5;
 
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
 
        boolean result = false;
        int totalBigWeight = bigCount * BIG_WEIGHT;
        if (totalBigWeight >= goal) {
            int remaining = goal % BIG_WEIGHT;
            if (smallCount >= remaining) {
                result = true;
            }
        } else {
            if (smallCount >= goal - totalBigWeight) {
                result = true;
            }
        }
        return result;
    }

}
