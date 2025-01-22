package JavaLearnNModel;

import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class N29 {
    public static void main(String[] args) {
        try( Scanner sc = new Scanner(System.in)) {
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//            int c = sc.nextInt();
//            if (a + b > c && a + c > b && b + c > a) {
//                int p = (a + b + c) / 2;
//                double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
//                System.out.printf("Площадь треугольника: %.2f\n", s);
//            } else {
//                System.out.println("Ошибка: стороны не образуют треугольник.");
//            }
//
//
////            int p = (a + b + c) / 2;
////            int s = (int) Math.sqrt(p * (p - a) * (p - b) * (p - c));
////            System.out.println(s);
////
////            // 2 задания
//            long value = sc.nextByte();
//            double kilobyte = value * 1024;
//            double megabyte = kilobyte * 1024;
//            double gigabyte = megabyte * 1024;
//            System.out.printf("%.2f", kilobyte);
//            System.out.printf("%.2f", megabyte);
//            System.out.printf("%.2f", gigabyte);
//
//
//            //3 задания
//            int year = sc.nextInt();
//            int month = sc.nextInt();
//            int day = sc.nextInt();
//            int[] list = {year, month, day};
//            List<Integer> intList = new ArrayList<Integer>(list.length);
//            for (int i : list) {
//                intList.add(i);
//            }
//            Collections.reverse(intList);
//            String output = intList.get(0) + "/" + intList.get(1) + "/" + intList.get(2);
//            System.out.println(output);
//            }
//        }    }
//
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (a + b > c && a + c > b && b + c > a) {
                int p = (a + b + c) / 2;
                double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                System.out.printf("Площадь треугольника: %.2f\n", s);
            } else {
                System.out.println("Ошибка: стороны не образуют треугольник.");
            }

            // 2. Конвертация байтов
            long value = sc.nextLong(); // Ввод байтов
            double kilobyte = value / 1024.0;
            double megabyte = kilobyte / 1024.0;
            double gigabyte = megabyte / 1024.0;
            System.out.printf("Килобайты: %.2f\n", kilobyte);
            System.out.printf("Мегабайты: %.2f\n", megabyte);
            System.out.printf("Гигабайты: %.2f\n", gigabyte);

            // 3. Форматирование даты
            int year = sc.nextInt();
            int month = sc.nextInt();
            int day = sc.nextInt();
            if (month < 1 || month > 12 || day < 1 || day > 31) {
                System.out.println("Ошибка: некорректная дата.");
            } else {
                System.out.printf("Дата: %02d/%02d/%d\n", day, month, year);
            }
        }
    }
}