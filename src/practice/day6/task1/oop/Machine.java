package practice.day6.task1.oop;

import practice.day6.task1.Colors;

public abstract class Machine {
    protected int year;
    protected String model;
    protected Colors color;

    public Machine() {
    }

    public Machine(int year, String model, Colors color) {
        this.year = year;
        this.model = model;
        this.color = color;
    }

    public void info() {
        System.out.printf("""
                Год выпуска: %d
                Модель: %s
                Цвет: %s
                %n""", this.year, this.model, this.color.text);
    }

    public int yearDifference(int inputYear) {
        return Math.abs(this.year - inputYear);
    }

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public Colors getColor() {
        return color;
    }
}
