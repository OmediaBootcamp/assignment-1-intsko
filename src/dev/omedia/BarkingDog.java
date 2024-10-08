package dev.omedia;

public class BarkingDog {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 23));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));
    }

    private static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 24) {
            return false;
        }
        return barking && (hourOfDay < 8 || hourOfDay >= 23);
    }
}
