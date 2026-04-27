package practice.day7.task1;

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

    public static void compareAirplanes(Airplane airplane1, Airplane airplane2) {
        if (airplane1.length == airplane2.length) {
            System.out.println("Самолёты равны.");
        } else if (airplane1.length > airplane2.length) {
            System.out.println("Первый самолёт длиннее второго.");
        } else {
            System.out.println("Второй самолёт длиннее первого.");
        }
    }

    public void info() {
        System.out.printf("Изготовитель: %s, год выпуска: %d, длина: %.2f, вес: %.2f, количество топлива в баке: %d\n",
                this.producer, this.year, this.length, this.weight, this.fuel);
    }

    public void fillUp(int value) {
        this.fuel += value;
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

    public String getProducer() {
        return producer;
    }

    public int getYear() {
        return year;
    }

    public double getLength() {
        return length;
    }

    public double getWeight() {
        return weight;
    }

    public int getFuel() {
        return fuel;
    }
}
