package practice.day7.task1;

public class Runner {
    public static void main(String[] args) {
        Airplane boeing = new Airplane("Boeing", 2001, 3000.21, 23332);
        Airplane pablo = new Airplane("Pablo", 2000, 3000.21, 3232);

        boeing.info();
        pablo.info();
        Airplane.compareAirplanes(boeing, pablo);
    }
}
