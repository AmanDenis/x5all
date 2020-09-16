package x5.second;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        int m, n, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое трёхзначное число: ");
        m = sc.nextInt();
        sc.close();
        int len = Integer.toString(m).length();
        if (len == 3) {
            while (m > 0) {
                n = m % 10;
                sum = sum + n;
                m = m / 10;
            }
            System.out.println("Сумма введённого числа: " + sum);
        } else {
            System.out.println("Вы ввели не трёхзначное число!");
        }
    }
}
