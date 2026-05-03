package practice.day9.task2.figures;

import practice.day9.task2.Colors;
import practice.day9.task2.Figure;

public class Triangle extends Figure {
    private final double lengthSide1, lengthSide2, lengthSide3;

    public Triangle(Colors color, double lengthSide1, double lengthSide2, double lengthSide3) {
        super(color);
        this.lengthSide1 = lengthSide1;
        this.lengthSide2 = lengthSide2;
        this.lengthSide3 = lengthSide3;
    }

    @Override
    public double area() {
        double p = perimeter() / 2;
        return Math.sqrt(p * (p - lengthSide1) * (p - lengthSide2) * (p - lengthSide3));
    }

    @Override
    public double perimeter() {
        return lengthSide1 + lengthSide2 + lengthSide3;
    }

    public double getLengthSide1() {
        return lengthSide1;
    }

    public double getLengthSide2() {
        return lengthSide2;
    }

    public double getLengthSide3() {
        return lengthSide3;
    }
}
