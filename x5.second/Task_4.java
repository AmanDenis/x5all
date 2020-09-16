
package x5.second;


import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        try {
            System.out.println("Введите целое число в консоль: ");
            Scanner sc = new Scanner(System.in);
            int i = sc.nextInt();
            sc.close();

            if (i > 0) i = i + 1;
            else if (i < 0) i = i -2;
            else if (i == 0) i = 10;

            if (i > 0) {
                i += 1;
            } else if (i < 0) {
                i -= 2;
            } else if (i == 0) {
                i = 10;
            }

            System.out.println("Полученное число: " + i);
        } catch (Exception e) {
            System.out.println("Вы ввели не целое число!");
        }
    }
}
