package x5.second;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        System.out.print("Введите число в консоль: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        numPosNegOrZero(a);
        numEvenOrOdd(a);
    }

    public static void numPosNegOrZero(int a) {

        if (a == 0) {
            System.out.print("Нулевое число ");
        } else if (a > 0) {
            System.out.print("Положительное ");
        } else {
            System.out.print("Отрицательное  ");
        }
    }

    public static void numEvenOrOdd(int a) {

        if (a % 2 == 0 & a !=0 ) {
            System.out.print("четное. ");
        } else if (a % 2 != 0) {
            System.out.print("нечетное. ");
        }
    }
}