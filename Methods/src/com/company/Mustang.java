package com.company;

public class Mustang extends Car {
    public Mustang() {
        super("mustang");
    }

    @Override
    public void drive() {
        // @Override keyword allows you to set a custom
        // drive method and either do your custom card in place of or along with the
        // inheritted method.
        String tense = this.isDriving ? "was" : "is";
        System.out.println("Mustang " + tense +" driving FAST!");
        super.drive(); // Calls the inheritted drive method
    }
}
