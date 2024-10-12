package dev.omedia;

public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(1.2345, 1.2346)); // true
        System.out.println(areEqualByThreeDecimalPlaces(1.2345, 1.234));  // true
        System.out.println(areEqualByThreeDecimalPlaces(1.2300, 1.230));  // true
        System.out.println(areEqualByThreeDecimalPlaces(1.2350, 1.2349)); // false
        System.out.println(areEqualByThreeDecimalPlaces(3.1756, 3.175));  // true
    }

    private static boolean areEqualByThreeDecimalPlaces(double a, double b) {
        return (int)(a * 1000) == (int)(b * 1000);
    }
}
