package practice;

import java.util.Random;
import java.util.Scanner;

public class Utilities {
    private static int taskNumber = 0;
    public static final Scanner SCANNER = new Scanner(System.in);
    public static final Random RANDOM = new Random();

    public static void printTaskNumber() {
        Utilities.taskNumber+=1;
        System.out.printf("\nЗадание %d:\n", Utilities.taskNumber);
    }

    public static void printCompletedCountTasks() {
        SCANNER.close();
        System.out.printf("\nВыполнено задач за день: %d", Utilities.taskNumber);
    }
}
