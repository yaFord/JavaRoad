package practice;

import java.util.Scanner;

public class Utilities {
    private static int taskNumber = 0;
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void printTaskNumber() {
        Utilities.taskNumber+=1;
        System.out.printf("\nЗадание %d:\n", Utilities.taskNumber);
    }

    public static void printCompletedCountTasks() {
        System.out.printf("\nВыполнено задач за день: %d", Utilities.taskNumber);
    }
}
