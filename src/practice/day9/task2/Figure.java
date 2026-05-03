package practice.day9.task2;

public abstract class Figure {
    private Colors color;

    public Figure(Colors color) {
        this.color = color;
    }

    public abstract double area();
    public abstract double perimeter();

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }
}
