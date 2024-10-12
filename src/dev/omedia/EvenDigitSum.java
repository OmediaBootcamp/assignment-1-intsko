package dev.omedia;

public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }

    private static int getEvenDigitSum(int number) {
        if (number < 0) return -1;

        int sum = 0;
        final String s = Integer.toString(number);

        for (int i = 0; i < s.length(); i++) {
            final int value = Integer.parseInt(String.valueOf(s.charAt(i)));
            if (value % 2 == 0) {
                sum += value;
            }
        }

        return sum;
    }
}
