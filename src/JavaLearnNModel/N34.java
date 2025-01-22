package JavaLearnNModel;

import java.util.Scanner;

//Напишите программу, которая выводит название дня недели по введенному номеру (от 1 до 7).
public class N34 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int day = sc.nextInt();
            switch (day) {
                case 1:
                    System.out.println("Понедельник");
                    break;
                case 2:
                    System.out.println("Вторник");
                    break;
                case 3:
                    System.out.println("Среда");
                    break;
                case 4:
                    System.out.println("Четверг");
                    break;
                case 5:
                    System.out.println("Пятница");
                    break;
                case 6:
                    System.out.println("Суббота");
                    break;
                case 7:
                    System.out.println("Воскресенье");
                    break;

                default:
                    System.out.println("Не правильно");

            }

        }
    }
}


//try (Scanner sc = new Scanner(System.in)) {
//        int day = sc.nextInt();
//
//        String[] days = {
//                "Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье"
//        };
//
//    if (day >= 1 && day <= 7) {
//        System.out.println(days[day - 1]); // Индекс дня (1 -> 0, 2 -> 1 и т.д.)
//    } else {
//            System.out.println("Неправильно");
//    }
//            }
//
