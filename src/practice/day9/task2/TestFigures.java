package practice.day9.task2;

import practice.day9.task2.figures.Circle;
import practice.day9.task2.figures.Rectangle;
import practice.day9.task2.figures.Triangle;

public class TestFigures {
    public static void main(String[] args) {
        Figure[] figures = {
                new Triangle(Colors.RED,10, 10, 10),
                new Triangle(Colors.GREEN, 10, 20, 30),
                new Triangle(Colors.RED, 10, 20, 15),
                new Rectangle(Colors.RED, 5, 10),
                new Rectangle(Colors.ORANGE, 40, 15),
                new Circle(Colors.RED, 4),
                new Circle(Colors.RED, 10),
                new Circle(Colors.BLUE, 5)
        };

        System.out.printf("Сумма периметров красных фигур: %.2f\n", calculateRedPerimeter(figures));
        System.out.printf("Сумма площадей красных фигур: %.2f\n", calculateRedArea(figures));
    }

    public static double calculateRedPerimeter(Figure[] figures) {
        double res = 0;
        for (Figure figure : figures) res += hasRedColor(figure) ? figure.perimeter() : 0;
        return res;
    }

    public static double calculateRedArea(Figure[] figures) {
        double res = 0;
        for (Figure figure : figures) res += hasRedColor(figure) ? figure.area() : 0;
        return res;
    }

    public static boolean hasRedColor(Figure figure) {
        return figure.getColor().equals(Colors.RED);
    }
}
