package dev.omedia;

public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(123));
    }

    private static boolean isPalindrome(int number) {
        final String numberString = Integer.toString(number);
        String reversedString = new StringBuilder(numberString).reverse().toString();

        if (number < 0) {
            reversedString = "-" + reversedString.substring(0, reversedString.length() - 1);
        }

        final int reverse = Integer.parseInt(reversedString);
        return number == reverse;
    }
}
