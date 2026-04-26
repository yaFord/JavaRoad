package practice.day5;

import practice.day5.oop.Car;
import practice.day5.oop.Motorbike;

import static practice.Utilities.printCompletedCountTasks;
import static practice.Utilities.printTaskNumber;

public class Runner {
    public static void main(String[] args) {
        printTaskNumber();
        Car car = new Car();

        car.setColor(Color.BLACK);
        car.setModel("BMW");
        car.setYearOfManufacture(2009);

        printInfo(car.getColor(), car.getModel(), car.getYearOfManufacture());


        printTaskNumber();
        Motorbike motorbike = new Motorbike(2005, Color.RED, "Крутая");
        printInfo(motorbike.getColor(), motorbike.getModel(), motorbike.getYearOfManufacture());


        printCompletedCountTasks();
    }

    public static void printInfo(Color color, String model, int yearOfManufacture) {
        System.out.printf("""
                Цвет: %s
                Модель: %s
                Год выпуска: %d
                """, color.text, model, yearOfManufacture);
    }
}
