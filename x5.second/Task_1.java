
package x5.second;


import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {

        System.out.println("Введите целое число в консоль: ");
        try {
            Scanner sc = new Scanner(System.in);
            int i = sc.nextInt();

            System.out.println("Вы ввели число: " + i);

            int last_digit;
            last_digit = lastDigit(i);
            System.out.println("Последняя цифра числа: " + last_digit);

            sc.close();
        } catch (Exception e) {
            System.out.println("Вы ввели не целое число!");
        }
    }


    private static int lastDigit(int i) {
        return i % 10;
    }

}
