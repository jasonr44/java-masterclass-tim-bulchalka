package com.company;

public class Car {
    private String model;

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
}
