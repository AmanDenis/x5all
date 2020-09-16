package x5all.x5.second;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите три числа через Enter: \n");

        int min = sc.nextInt();

        for (int i = 0; i < 2; i++) {
            int a = sc.nextInt();
            if (a < min) {
                min = a;
            }
        }
        System.out.println("Наименьшее: " + min);
    }
}
