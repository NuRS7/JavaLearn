package JavaLearnNModel;
//Реализуйте программу, которая выводит треугольник из звездочек высотой
//N (введенное пользователем число). Например:
//        *
//        ***
//        *****

import java.util.Scanner;

public class N47 {
    public static void main(String[] args) {
            // Вводим число N (высоту треугольника)
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите высоту треугольника: ");
            int N = scanner.nextInt();

            // Строим треугольник
            for (int i = 1; i <= N; i++) {
                // Печатаем пробелы
                for (int j = 1; j <= N - i; j++) {
                    System.out.print(" ");
                }
                // Печатаем звезды
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*");
                }
                // Переход на новую строку
                System.out.println();
            }

            scanner.close();
        }
    }