package practice.day4;

import java.util.Arrays;

import static practice.Utilities.*;

public class AiTasks {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        printCompletedCountTasks();
    }

    public static void task1() {
        printTaskNumber();
        System.out.print("Введите размер массива: ");
        int length = SCANNER.nextInt(), min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, indexMin = -1, indexMax = -1;
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            int num = RANDOM.nextInt(11);
            array[i] = num;

            if (num > max) {
                max = num;
                indexMax = i;
            }
            if (num < min) {
                min = num;
                indexMin = i;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.printf("Минимум: %d [Индекс: %d]. Максимум: %d [Индекc: %d]\n", min, indexMin, max, indexMax);
    }

    public static void task2() {
        printTaskNumber();
        System.out.print("Введите размер массива: ");
        int length = SCANNER.nextInt(), max = Integer.MIN_VALUE, secondLarge = Integer.MIN_VALUE;
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            int num = RANDOM.nextInt(11);
            array[i] = num;

            if (num > max) {
                secondLarge = max;
                max = num;
            } else if (num > secondLarge && num != max) {
                secondLarge = num;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.printf("Второе по величине число: %d\n", secondLarge);
    }

    public static void task3() {
        printTaskNumber();
        System.out.print("Введите размер массива: ");
        int length = SCANNER.nextInt(), max = Integer.MIN_VALUE;
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            int num = -RANDOM.nextInt(1000);
            array[i] = num;

            if (num > max) max = num;
        }
        System.out.println(Arrays.toString(array));
        System.out.printf("Максимум: %d\n", max);
    }

    public static void task4() {
        printTaskNumber();
        int[][] matrix = new int[3][3];
        int max = Integer.MIN_VALUE, index = -1, indexLine = -1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int num = RANDOM.nextInt(11);
                matrix[i][j] = num;
                if (num > max) {
                    max = num;
                    index = j;
                    indexLine = i;
                }
            }
            System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.printf("Максимум %d находится под индексом %d в строке %d\n", max, index, indexLine);
    }
}
