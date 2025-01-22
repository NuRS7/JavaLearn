package JavaLearnNModel;

import java.util.Scanner;

//Напишите программу, которая принимает три числа, представляющих длины сторон треугольника, и определяет,
//является ли треугольник прямоугольным, равносторонним или разносторонним.
//public class N35 {
//    public static void main(String[] args) {
//        try (Scanner sc = new Scanner(System.in)) {
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//            int c = sc.nextInt();
//
//            if (a == b && b == c) {
//                System.out.println("Треугольник равносторонний");
//            } else if (a == b || b == c || a == c) {
//                System.out.println("Треугольник прямоугольным");
//
//            } else {
//                System.out.println("разносторонним");
//            }
//        }
//    }
//}
import java.util.Scanner;

// Программа для определения типа треугольника
public class N35 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Введите три стороны треугольника:");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            // Проверка существования треугольника
            if (a + b <= c || a + c <= b || b + c <= a) {
                System.out.println("Такого треугольника не существует.");
            } else if (a == b && b == c) {
                // Равносторонний треугольник
                System.out.println("Треугольник равносторонний.");
            } else if (a == b || b == c || a == c) {
                // Равнобедренный треугольник
                System.out.println("Треугольник равнобедренный.");
            } else if (isRightTriangle(a, b, c)) {
                // Прямоугольный треугольник
                System.out.println("Треугольник прямоугольный.");
            } else {
                // Разносторонний треугольник
                System.out.println("Треугольник разносторонний.");
            }
        }
    }

    // Метод для проверки прямоугольного треугольника (теорема Пифагора)
    private static boolean isRightTriangle(int a, int b, int c) {
        int max = Math.max(a, Math.max(b, c)); // Находим самую длинную сторону
        if (max == a) {
            return a * a == b * b + c * c;
        } else if (max == b) {
            return b * b == a * a + c * c;
        } else {
            return c * c == a * a + b * b;
        }
    }
}
