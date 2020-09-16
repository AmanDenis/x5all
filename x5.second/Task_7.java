package x5.second;

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        System.out.print("Введите код города: ");
        Scanner sc = new Scanner(System.in);
        String i = sc.nextLine();
        sc.close();
        int time = 10;
        switch (i) {
            case "905":
                System.out.println("Стоимость 10 минутного звонка в Москву: " + time * 4.15);
                break;
            case "194":
                System.out.println("Стоимость 10 минутного звонка в Ростов: " + time * 1.98);
                break;
            case "491":
                System.out.println("Стоимость 10 минутного звонка в Краснодар: " + time * 2.69);
                break;
            case "800":
                System.out.println("Стоимость 10 минутного звонка в Киров: " + time * 5.00);
                break;
            default:
                System.out.println("Код города неизвестен!");
        }
    }
}