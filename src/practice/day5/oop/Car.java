package practice.day5.oop;

import practice.day5.Color;

public class Car {
    private int yearOfManufacture;
    private Color color;
    private String model;

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setModel(String model) {
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
