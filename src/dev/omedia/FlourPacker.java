package dev.omedia;

public class FlourPacker {
    public static void main(String[] args) {
        System.out.println(canPack (1, 0, 4));
        System.out.println(canPack (1, 0, 5));
    }

    private static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        int maxBigBags = goal / 5;

        if (bigCount > maxBigBags) {
            bigCount = maxBigBags;
        }

        int remainingGoal = goal - (bigCount * 5);

        return remainingGoal <= smallCount;
    }
}
