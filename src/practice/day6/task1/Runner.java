package practice.day6.task1;

import practice.day6.task1.oop.Car;
import practice.day6.task1.oop.Motorbike;

public class Runner {
    public static void main(String[] args) {
        Car car = new Car();
        Motorbike motorbike = new Motorbike(2009, "Крутой", Colors.BLACK);

        car.setYear(2007);
        car.setModel("BMW");
        car.setColor(Colors.RED);

        car.info();
        motorbike.info();
        System.out.println(car.yearDifference(2001));
        System.out.println(motorbike.yearDifference(2001));
    }
}
