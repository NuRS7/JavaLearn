package JavaLearnNModel;

import java.math.*;
import java.util.Scanner;

//Given the positive integer n and the positive floating point number h, output to three decimal places the sum of the terms in the sequence whose absolute value is less than h.
//The general term of the sequence is 2 - 10 * sin(3 * i), where 0 <= i <n.
//Format of an input line is n h.
//Input length is correct.
import java.util.Scanner;
class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // Ввод n
        double h = sc.nextDouble();  // Ввод h
        double sum = 0.0;

        for (int i = 0; i < n; i++) {
            double value = 2 - 10 * Math.sin(3 * i);  // Вычисление элемента последовательности

            if (Math.abs(value) < h) {
                sum += value;  // Добавляем к сумме только если |value| < h
            }
        }

        // Вывод результата с округлением до трех знаков
        System.out.printf("%.3f\n", sum);
    }
}
