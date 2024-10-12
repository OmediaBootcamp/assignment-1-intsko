package dev.omedia;

public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }

    private static boolean hasSharedDigit(int num1, int num2) {
        if (num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99) {
            return false;
        }

        int num1Digit1 = num1 / 10;
        int num1Digit2 = num1 % 10;

        int num2Digit1 = num2 / 10;
        int num2Digit2 = num2 % 10;

        return (num1Digit1 == num2Digit1 || num1Digit1 == num2Digit2 ||
                num1Digit2 == num2Digit1 || num1Digit2 == num2Digit2);
    }
}
