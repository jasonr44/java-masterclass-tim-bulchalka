package com.company;

public class Main {

    public static void main(String[] args) {
	// Float
    float myMinFloatValue = Float.MIN_VALUE;
    float myMaxFloatValue = Float.MAX_VALUE;

    System.out.println("Float minimum value = " + myMinFloatValue);
    System.out.println("Float max value = " + myMaxFloatValue);

	// Double
    double myMinDoubleValue = Double.MIN_VALUE;
    double myMaxDoubleValue = Double.MAX_VALUE;

    System.out.println("Double minimum value = " + myMinDoubleValue);
    System.out.println("Double max value = " + myMaxDoubleValue);

    // More Stuff
    int myIntValue = 5 / 3;
    float myFloatValue = 5f / 3f;
    double myDoubleValue = 5d / 3d; // Preferred over float

    System.out.println("Int value = " + myIntValue);
    System.out.println("Float value = " + myFloatValue);
    System.out.println("Double value = " + myDoubleValue);

    // Challenge
    double thePounds = 200;
    double kiloConversion = 0.45359237;
    double result = thePounds * kiloConversion;

        System.out.println("Converted Pounds to Kilograms = " + result);

    }
}
