package practice.day8.task2;

public class Runner {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("pablo", 2004, 45.42, 69.69);
        airplane.info();
        airplane.fillUp(20);
        airplane.info();
        System.out.println(airplane);
    }
}
