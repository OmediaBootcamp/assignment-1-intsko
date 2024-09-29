package dev.omedia;

public class TeenNumberChecker {
    public static void main(String[] args) {
        System.out.println(hasTeen(9, 99, 19)); // true
        System.out.println(hasTeen(23, 15, 42)); // true
        System.out.println(hasTeen(22, 23, 34)); // false
        System.out.println(isTeen(9)); // false
        System.out.println(isTeen(13)); // true
    }

    private static boolean hasTeen(int a, int b, int c) {
        return (a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19);
    }

    private static boolean isTeen(int a) {
       return a >= 13 && a <= 19;
    }
}
