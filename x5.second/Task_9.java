package x5.second;

import java.util.Arrays;

public class Task_9 {
    public static void main(String[] args) {

        int a[] = {15, 10, 51, -6, -5, 3, -10, -34, 0, 32, 56, -12, 24, -52};
        int[] aReverse = new int[a.length];
        int b = 0;

        for (int i = a.length - 1; i >= 0; i--) {
            aReverse[b] = a[i];
            b++;

        }
        System.out.println(Arrays.toString(aReverse));
    }
}