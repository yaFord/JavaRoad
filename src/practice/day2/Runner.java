package practice.day2;

import static practice.Utilities.*;

public class Runner {
    public static void main(String[] args) {
        printTaskNumber();
        System.out.print("Введите кол-во этажей: ");
        int countFloors = SCANNER.nextInt();
        if (countFloors >= 9) {
            System.out.println("Многоэтажный дом");
        } else if (countFloors >= 5) {
            System.out.println("Среднеэтажный дом");
        } else if (countFloors >= 1) {
            System.out.println("Малоэтажный дом");
        } else {
            System.err.println("Ошибка ввода");
        }

        printTaskNumber();
        System.out.print("Введите число a: ");
        int a1 = SCANNER.nextInt();
        System.out.print("Введите число b: ");
        int b1 = SCANNER.nextInt();
        if (a1 >= b1) {
            System.err.println("Некорректный ввод");
        } else {
            for (int i = a1+1; i < b1; i++) {
                if (i % 5 == 0 && i % 10 != 0) System.out.print(i + " ");
            }
        }

        printTaskNumber();
        System.out.print("Введите число a: ");
        int a2 = SCANNER.nextInt();
        System.out.print("Введите число b: ");
        int b2 = SCANNER.nextInt();
        if (a2 >= b2) {
            System.err.println("Некорректный ввод");
        } else {
            int x = a2;
            while (x < b2) {
                x++;
                if (x % 5 == 0 && x % 10 != 0) {
                    System.out.print(x + " ");
                }
            }
        }

        printTaskNumber();
        System.out.print("Введите x: ");
        double x = SCANNER.nextDouble();
        double y;
        if (x >= 5) {
            y = (Math.pow(x, 2) - 10) / (x + 7);
        } else if (x >= -3) {
            y = (x + 3) * (Math.pow(x, 2) - 2);
        } else {
            y = 420;
        }
        System.out.printf("y = %.2f", y);

        SCANNER.close();
        printCompletedCountTasks();
    }
}
