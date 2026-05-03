package practice.day8.task1;

public class Runner {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        String numbersVer1 = "";
        StringBuilder numbersVer2 = new StringBuilder();

        for (int i = 0; i <= 20000; i++) numbersVer1 += " " + i;
        for (int i = 0; i <= 20000; i++) numbersVer2.append(" ").append(i);

        System.out.println(numbersVer1);
        System.out.println(numbersVer2);
        System.out.printf("Потрачено времени: %d мс", System.currentTimeMillis() - time);
    }
}
