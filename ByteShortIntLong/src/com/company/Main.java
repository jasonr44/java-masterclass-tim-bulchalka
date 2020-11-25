package com.company;

public class Main {

    public static void main(String[] args) {
        // Ints
	    int myValue = 10000;

	    int myMinIntValue = Integer.MIN_VALUE;
	    int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);

        // Underflow and Overflow
        System.out.println("Busted Min Value = " + (myMinIntValue - 1));
        System.out.println("Busted Maximum Value = " + (myMaxIntValue + 1));

        // Ints can be written with underscores for better readability.
        int first1000 = 1000;
        int second1000 = 1_000;

        System.out.println(first1000 == second1000);

        // Bytes
        byte minMyMinByte = Byte.MIN_VALUE;
        byte minMaxMinByte = Byte.MAX_VALUE;

        System.out.println("Min byte is = " + minMyMinByte);
        System.out.println("Max byte is = " + minMaxMinByte);

        // Shorts
        short minMyMinShort = Short.MIN_VALUE;
        short minMaxMinShort = Short.MAX_VALUE;

        System.out.println("Min short is = " + minMyMinShort);
        System.out.println("Max short is = " + minMaxMinShort);

        // Longs
        long myLongValue = 100L; // L required to treat number as a Long.
        long minMyMinLong = Long.MIN_VALUE;
        long minMaxMinLong = Long.MAX_VALUE;

        System.out.println("Min long is = " + minMyMinLong);
        System.out.println("Max long is = " + minMaxMinLong);

        int myTotal = (myMinIntValue / 2);

        // Casting
        byte myNewByteValue = (byte) (minMyMinByte / 2);
        short myNewShortValue = (short) (minMyMinShort / 2);

        // Challenge
        byte byteChallenge = 2;
        short shortChallenge = 20000;
        int intChallenge = 402340;
        long longChallenge = (long) (50000 + (10 * (byteChallenge + shortChallenge + intChallenge)));

        System.out.println(longChallenge);
    }
}
