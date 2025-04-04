package E_Model;

import java.util.Scanner;

public class E29 {
    public static void main(String[] args) {
        // Считываем входное число
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        // Извлекаем цифры числа с помощью математических операций
        int digit1 = number / 1000;  // Первая цифра
        int digit2 = (number % 1000) / 100;  // Вторая цифра
        int digit3 = (number % 100) / 10;    // Третья цифра
        int digit4 = number % 10;  // Четвёртая цифра

        // Вычисляем произведение цифр
        int product = digit1 * digit2 * digit3 * digit4;

        // Выводим результат
        System.out.println(product);
    }
}
