package Basics;

import java.util.Scanner;

public class TryCatchFinally {
    public static void main(String[] args) {
//try-catch-finally — это механизм обработки исключений в Java.
//Основная цель:
//
//Позволяет программе не завершаться с ошибкой, а обрабатывать исключения.
//Позволяет выполнять код в finally, независимо от того, было исключение или нет.

        try {
            int[] numbers = new int[3];
            numbers[4] = 3;
            System.out.println(numbers[4]);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Done"); // finally гарантированно выполняется после try / catch.
        }
        Exeption();

    }

    public static void Exeption() {
        try {
            Scanner scanner = new Scanner(System.in);
            int x = scanner.nextInt();
            if (0<x && x >= 30) {
                throw new IllegalStateException("Число x должно быть меньше 30");
            }

        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            System.out.println(exception.toString());
            System.out.println(exception.fillInStackTrace());
            exception.printStackTrace();
            exception.addSuppressed(exception);
        }
        finally {
            System.out.println("Done");
        }
    }
}
