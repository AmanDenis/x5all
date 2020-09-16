package x5.second;

import java.util.Arrays;

public class Task_10 {
    public static void main(String[] args) {
        int arr[] = {15, 10, 0, -6, -5, 3, 0, -34, 0, 32, 56, 0, 24, -52};
        System.out.println("Текущий массив: " + Arrays.toString(arr));
        int n = arr.length;
        moveZerosToEnd(arr, n);
        System.out.println("Выводим нули в конец массива: " + Arrays.toString(arr));
    }

    static void moveZerosToEnd(int arr[], int n) {
        int count = 0;
        for (int i = 0; i < n; i++)
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        while (count < n)
            arr[count++] = 0;
    }
}