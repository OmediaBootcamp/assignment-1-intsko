package dev.omedia;

public class NumberToWords {
    public static void main(String[] args) {
        System.out.println(getDigitCount(123)); // 3
        System.out.println(reverse(1234)); // 4321
        numberToWords(123); // "One Two Three"
    }

    private static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        int reversedNumber = reverse(number);
        int originalDigitCount = getDigitCount(number);

        for (int i = 0; i < originalDigitCount; i++) {
            int digit = reversedNumber % 10;
            reversedNumber /= 10;
            printDigitInWord(digit);
        }
        System.out.println();
    }

    private static int reverse(int number) {
        int reversedNumber = 0;
        int isNegative = number < 0 ? -1 : 1;
        number = Math.abs(number);

        while (number > 0) {
            int lastDigit = number % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            number /= 10;
        }

        return reversedNumber * isNegative;
    }

    private static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }

        if (number == 0) {
            return 1;
        }

        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }

        return count;
    }

    private static void printDigitInWord(int digit) {
        switch (digit) {
            case 0:
                System.out.print("Zero ");
                break;
            case 1:
                System.out.print("One ");
                break;
            case 2:
                System.out.print("Two ");
                break;
            case 3:
                System.out.print("Three ");
                break;
            case 4:
                System.out.print("Four ");
                break;
            case 5:
                System.out.print("Five ");
                break;
            case 6:
                System.out.print("Six ");
                break;
            case 7:
                System.out.print("Seven ");
                break;
            case 8:
                System.out.print("Eight ");
                break;
            case 9:
                System.out.print("Nine ");
                break;
            default:
                System.out.print("Invalid ");
                break;
        }
    }

}
