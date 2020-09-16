package x5.second;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        System.out.println("Введите три числа через пробел: ");

        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        sc.close();
        String str[] = number.split(" ");
        int maxNum = Integer.parseInt(str[0]);

        for (String s : str) {
            if (Integer.parseInt(s) > maxNum) {
                maxNum = Integer.parseInt(s);
            }
        }

        System.out.println(maxNum);
    }
}