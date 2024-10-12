package dev.omedia;

public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(561600);
    }

    private static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        long minutesInYear = 60 * 24 * 365; // 60 minutes * 24 hours * 365 days
        long minutesInDay = 60 * 24; // 60 minutes * 24 hours

        long years = minutes / minutesInYear;
        long remainingMinutes = minutes % minutesInYear;
        long days = remainingMinutes / minutesInDay;

        System.out.println(minutes + " min = " + years + " y " + "and " + days + " d");
    }
}
