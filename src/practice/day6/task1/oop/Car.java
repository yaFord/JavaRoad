package practice.day6.task1.oop;

import practice.day6.task1.Colors;

public class Car extends Machine {
    public void setYear(int year) {
        this.year = year;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(Colors color) {
        this.color = color;
    }
}
