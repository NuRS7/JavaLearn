package JavaLearnNModel;

import java.util.Scanner;

//Напишите программу, которая проверяет, является ли введенное
//        число положительным, отрицательным или равным нулю.
public class N30 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int number = sc.nextInt();
            if (number > 0) {
                System.out.println("Положительное число");

            }
            if (number < 0) {
                System.out.println("Отрицательное число");
            }
            if (number == 0) {
                System.out.println("Равно нулю");
            }

            if (number % 3 == 0) {
                System.out.println("Делится на 3");

            } else {
                System.out.println(" Не делится на 3");

            }
            String letter_check = sc.nextLine().trim().toUpperCase(); // Убираем пробелы и приводим к верхнему регистру

            String letters1 = "БВГДЖЗЙКЛМНПРСТФХЦЧШЩ"; // Согласные буквы
            String letters2 = "АИОУЫЭЕЁЮЯ"; // Гласные буквы

            if (letter_check.length() != 1 || !Character.isLetter(letter_check.charAt(0))) {
                System.out.println("Не буква"); // Если введено больше одного символа или не буква
            } else if (letters1.contains(letter_check)) {
                System.out.println("Согласная буква");
            } else if (letters2.contains(letter_check)) {
                System.out.println("Гласная буква");
            } else {
                System.out.println("Неизвестный символ");
            }



        }
    }

}
