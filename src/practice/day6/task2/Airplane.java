package practice.day6.task2;

public class Airplane {
    private String producer;
    private int year;
    private double length;
    private double weight;
    private int fuel = 0;

    public Airplane(String producer, int year, double length, double weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }

    public void info() {
        System.out.printf("Изготовитель: %s, год выпуска: %d, длина: %.2f, вес: %.2f, количество топлива в баке: %d\n",
                this.producer, this.year, this.length, this.weight, this.fuel);
    }

    public void fillUp(int value) {
        this.fuel += value;
    }

    public int getFuel() {
        return fuel;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
