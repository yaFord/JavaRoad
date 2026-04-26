package practice.day5.oop;

import practice.day5.Color;

public class Motorbike {
    private final int yearOfManufacture;
    private final Color color;
    private final String model;

    public Motorbike(int yearOfManufacture, Color color, String model) {
        this.yearOfManufacture = yearOfManufacture;
        this.color = color;
        this.model = model;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public Color getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }
}
