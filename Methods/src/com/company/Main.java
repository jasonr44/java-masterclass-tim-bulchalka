package com.company;

public class Main {

    public static void main(String[] args) {
        // Casting
	    SpeedConverter converter = new SpeedConverter();
	    converter.printConversion(10.25);

        // User Input
        MethodTester methodTester = new MethodTester();
        methodTester.readUserInput();
    }
}
