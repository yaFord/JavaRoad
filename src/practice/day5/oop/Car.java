package practice.day5.oop;

import practice.day5.Colors;

public class Car {
    private int yearOfManufacture;
    private Colors color;
    private String model;

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    public void setModel(String model) {
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
