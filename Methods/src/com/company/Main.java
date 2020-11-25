package com.company;

public class Main {

    public static void main(String[] args) {
//        // Casting
//	    SpeedConverter converter = new SpeedConverter();
//	    converter.printConversion(10.25);
//
//        // User Input
//        MethodTester methodTester = new MethodTester();
//        methodTester.readUserInput();

        // Getter/Setter
        Car goodCar = new Car();
        Car badCar = new Car();
        Car constructedCar = new Car("mustang");
        Mustang mustang =  new Mustang();

        goodCar.setModel("mustang");
        badCar.setModel("escort");
        mustang.drive();
        mustang.drive();
        mustang.drive();

        System.out.println("Good car is " + goodCar.getModel());
        System.out.println("Bad car is " + badCar.getModel());
        System.out.println("Constructed car is " + constructedCar.getModel());
    }
}
