package practice.day6.task2;

public class Runner {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Аэрофлот", 2001, 5.4, 555);
        airplane.info();

        airplane.fillUp(400);
        airplane.fillUp(2121);
        airplane.setYear(2002);
        airplane.setLength(5.1);

        airplane.info();
    }
}
