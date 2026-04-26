package practice.day4;

import java.util.Arrays;

import static practice.Utilities.*;

public class Runner {
    public static void main(String[] args) {
        printTaskNumber();
        System.out.print("Введите размер массива: ");
        int size = SCANNER.nextInt();
        int[] arrayTask1 = new int[size];

        int countNumMoreThan8 = 0, countNumEquals1 = 0, countNumEven = 0, sumTask1 = 0;

        for (int i = 0; i < size; i++) {
            int num = RANDOM.nextInt(11);
            arrayTask1[i] = num;

            sumTask1 += num;
            if (num == 1) countNumEquals1++;
            if (num > 8) countNumMoreThan8++;
            if (num % 2 == 0) countNumEven++;
        }
        System.out.printf("Введено число %d. Сгенерирован следующий массив: \n%s\n", size, Arrays.toString(arrayTask1));
        System.out.printf("""
                а) Длина массива = %d.
                б) Количество чисел больше 8: %d.
                в) Количество чисел равных 1: %d.
                г) Количество четных чисел: %d.
                д) Количество нечетных чисел: %d.
                е) Сумма всех элементов массива: %d.
                """, size, countNumMoreThan8, countNumEquals1, countNumEven, size - countNumEven, sumTask1);


        printTaskNumber();
        int[] arrayTask2 = new int[100];
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, countZero = 0, sumTask2 = 0;

        for (int i = 0; i < arrayTask2.length; i++) {
            int num = RANDOM.nextInt(10001);
            arrayTask2[i] = num;

            if (num > max) max = num;
            if (num < min) min = num;
            if (num % 10 == 0) {
                countZero++;
                sumTask2+=num;
            }
        }
        System.out.printf("""
                Макс. число: %d.
                Мин. число: %d.
                Количество чисел с нулем на конце: %d.
                Сумма всех чисел: %d.
                """, max, min, countZero, sumTask2);


        printTaskNumber();
        int[][] arrayTask3 = new int[12][8];
        int maxSum = Integer.MIN_VALUE;
        int indexTask3 = -1;

        for (int j = 0; j < arrayTask3.length; j++) {
            int sum = 0;
            for (int i = 0; i < arrayTask3[j].length; i++) {
                int num = RANDOM.nextInt(51);
                arrayTask3[j][i] = num;
                sum += num;
            }
            if (sum >= maxSum) {
                maxSum = sum;
                indexTask3 = j;
            }
        }
        System.out.printf("Ответ: %d\n", indexTask3);


        printTaskNumber();
        int[] arrayTask4 = new int[100];
        int sum = 0, indexTask4 = -1;

        for (int i = 0; i < arrayTask4.length; i++) {
            arrayTask4[i] = RANDOM.nextInt(10001);
            if (i < arrayTask4.length - 2) {
                int y = arrayTask4[i] + arrayTask4[i + 1] + arrayTask4[i + 2];
                if (y > sum) {
                    sum = y;
                    indexTask4 = i;
                }
            }

        }
        System.out.printf("%d\n%d\n", sum, indexTask4);

        printCompletedCountTasks();
    }
}
