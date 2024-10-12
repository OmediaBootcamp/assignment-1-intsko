package dev.omedia;

public class DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(8);
    }

    private static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        for (int row = 1; row <= number; row++) {
            for (int col = 1; col <= number; col++) {
                if (row == 1 || row == number ||
                        col == 1 || col == number ||
                        col == row ||
                        col == (number - row + 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
