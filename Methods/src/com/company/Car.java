package com.company;


public class Car {
    private String model;
    private String make;
    public Boolean isDriving = false;

    public Car() {
        System.out.println("You'll need to add a model");
    }

    public Car(String model) {
        /*
            this.setModel(model);
            While you can perform the line above, it is generally recommended
            not to use other methods/setters in the constructor.
            But it IS recommended to call other constructors like the Boolean examples below.
         */
        this.model = model;
    }

    public Car(Boolean knownType) {
        // A recommended approach to call another constructor...
        // "this" calls the constructor below where it starts
        // with a Boolean parameter and has two parameters
        this(knownType, "noTypeSpecified");
    }

    public Car(Boolean knownType, String carType) {
        if (!knownType) {
            this.make = "noTypeSpecified";
        }
        this.make = carType;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        String validModel;

        if (model.toLowerCase() == "mustang") {
            validModel = "goodModel";
        } else {
            validModel = "notAMustangAKASucks";
        }

        this.model = validModel;
    }
    
    public void drive() {
        this.isDriving = !this.isDriving;
    }
}
