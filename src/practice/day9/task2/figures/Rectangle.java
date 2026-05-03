package practice.day9.task2.figures;

import practice.day9.task2.Colors;
import practice.day9.task2.Figure;

public class Rectangle extends Figure {
    private final double width, height;

    public Rectangle(Colors color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}
