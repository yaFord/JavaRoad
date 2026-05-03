package practice.day9.task2.figures;

import practice.day9.task2.Colors;
import practice.day9.task2.Figure;

public class Circle extends Figure {
    private final double radius;

    public Circle(Colors color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double perimeter() {
        return 2 * radius * Math.PI;
    }

    public double getRadius() {
        return radius;
    }
}
