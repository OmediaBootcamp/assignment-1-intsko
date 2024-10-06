package dev.omedia;

public class SpeedConverter {
    public static void main(String[] args) {
        printConversion(95.75);
    }

    private static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }

        double miles = 0.6215;
        return Math.round(kilometersPerHour * miles);
    }

    private static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
            return;
        }

        System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
    }
}
