package com.company;

public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }

        return (long) Math.round(kilometersPerHour * (1/1.609));
    }

    public static void printConversion(double kilometersPerHour) {
        String message = "";
        long milesPerHour = toMilesPerHour(kilometersPerHour);

        if (milesPerHour == -1) {
            message = "Invalid Value";
        } else {
            message = kilometersPerHour + " km/h = " + milesPerHour + " mi/h";
        }

        System.out.println(message);
    }
}