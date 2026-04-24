package practice.day1;

import static practice.Utilities.printCompletedCountTasks;
import static practice.Utilities.printTaskNumber;

public class Runner {
    public static void main(String[] args) {
        printTaskNumber();
        int x = 1;
        while (x <= 10) {
            System.out.print("JAVA ");
            x++;
        }

        printTaskNumber();
        for (int i = 1; i <= 10; i++) {
            System.out.print("JAVA ");
        }

        printTaskNumber();
        int y = 1;
        while (y <= 10) {
            System.out.println("JAVA");
            y++;
        }

        printTaskNumber();
        int year1 = 1980;
        while (year1 <= 2020) {
            System.out.printf("Олимпиада %d года\n", year1);
            year1 += 4;
        }

        printTaskNumber();
        for (int year2 = 1980; year2 <= 2020; year2+=4) {
            System.out.printf("Олимпиада %d года\n", year2);
        }

        printTaskNumber();
        int k = 3;
        for (int i = 1; i < 10; i++) {
            System.out.printf("%d * %d = %d\n", i, k, i*k);
        }

        printCompletedCountTasks();
    }
}
