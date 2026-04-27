package practice.day5.oop;

import practice.day5.Colors;

public class Motorbike {
    private final int yearOfManufacture;
    private final Colors color;
    private final String model;

    public Motorbike(int yearOfManufacture, Colors color, String model) {
        this.yearOfManufacture = yearOfManufacture;
        this.color = color;
        this.model = model;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public Colors getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }
}
