package x5.second;

import java.util.Arrays;

public class Task_8 {
    public static void main(String[] args) {
        int m[] = {1, -10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2};
        System.out.println("Максимальное значение массива: " + Arrays.stream(m).max().getAsInt());
        System.out.println("Сума положительных элементов массива: " + sumOfPositivesNumbers(m));
        System.out.println("Сума чётных отрицательных элементов массива: " + sumOfEvenNegativeNumbers(m));
        System.out.println("Количество положительных элементов: " + positiveNumbers(m));
        System.out.println("Среднее арифметическое отрицательных элементов: " + arithmeticalMean(m));
    }

    public static int sumOfPositivesNumbers(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                sum += a[i];
            }
        }
        return sum;
    }

    public static int sumOfEvenNegativeNumbers(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if ((a[i] < 0) & (a[i] % 2 == 0)) {
                sum += a[i];
            }
        }
        return sum;
    }

    public static int positiveNumbers(int[] a) {
        int positive = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                positive += 1;
            }
        }
        return positive;
    }

    public static double arithmeticalMean(int[] a) {
        int elements = 0;
        double sum = 0;
        if (a != null) {
            for (int i = 1; i < a.length; i++) {
                if (a[i] < 0) {
                    sum += a[i];
                    elements++;
                }
            }
        }
        return sum / elements;
    }
}

