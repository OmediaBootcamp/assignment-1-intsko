package dev.omedia;

public class FirstLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
    }

    private static int sumFirstAndLastDigit(int number) {
        if (number < 0) return -1;

        final String s = Integer.toString(number);
        final int first = Integer.parseInt(s.substring(0, 1));
        final int last = Integer.parseInt(s.substring(s.length() - 1));

        return first + last;
    }
}
