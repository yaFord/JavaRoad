package practice.day3;

import java.util.Locale;

import static practice.Utilities.*;

public class Runner {
    public static void main(String[] args) {
        printTaskNumber();
        while (true) {
            System.out.print("Введите название города: ");
            String city = SCANNER.next().toLowerCase(Locale.ROOT);
            if (city.equals("stop")) break;
            switch (city) {
                case "москва", "владивосток", "ростов":
                    System.out.println("Россия");
                    break;
                case "рим", "милан", "турин":
                    System.out.println("Италия");
                    break;
                case "ливерпуль", "манчестер", "лондон":
                    System.out.println("Англия");
                    break;
                case "берлин", "мюнхен", "кёльн":
                    System.out.println("Германия");
                    break;
                default:
                    System.err.println("Неизвестная страна");
                    break;
            }
        }
        System.out.println("*программа завершила работу*");

        printTaskNumber();
        while (true) {
            System.out.print("Введите делимое: ");
            double x = SCANNER.nextDouble();
            System.out.print("Введите делитель: ");
            double y = SCANNER.nextDouble();
            if (y == 0) break;
            System.out.printf("Результат: %.2f\n", x / y);
        }
        System.out.println("*программа завершила работу*");

        printTaskNumber();
        int count = 0;
        while (count < 5) {
            System.out.print("Введите делимое: ");
            double x = SCANNER.nextDouble();
            System.out.print("Введите делитель: ");
            double y = SCANNER.nextDouble();

            count++;

            if (y == 0) {
                System.err.println("Деление на 0");
                continue;
            }

            System.out.printf("Результат: %.2f\n", x / y);
        }

        printCompletedCountTasks();
    }
}
