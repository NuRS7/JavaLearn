package Neetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode412 {

    // Метод fizzBuzz, который принимает целое число n и возвращает список строк
    public static List<String> fizzBuzz(int n) {
        // Создаём новый список для хранения ответов (строк)
        List<String> answer = new ArrayList<>(n);

        // Цикл от 1 до n (включительно)
        for (int i = 1; i <= n; i++) {
            // Проверяем, делится ли число на 3
            boolean divisibleBy3 = i % 3 == 0;
            // Проверяем, делится ли число на 5
            boolean divisibleBy5 = i % 5 == 0;

            // Если число делится и на 3, и на 5, добавляем в список "FizzBuzz"
            if (divisibleBy3 && divisibleBy5) {
                answer.add("FizzBuzz");
            }
            // Если число делится только на 3, добавляем в список "Fizz"
            else if (divisibleBy3) {
                answer.add("Fizz");
            }
            // Если число делится только на 5, добавляем в список "Buzz"
            else if (divisibleBy5) {
                answer.add("Buzz");
            }
            // Если число не делится ни на 3, ни на 5, добавляем в список само число как строку
            else {
                answer.add(i + "");
            }
        }

        // Печатаем результат в консоль
        System.out.println(answer);

        // Возвращаем список ответов
        return answer;
    }

    // Главный метод для тестирования
    public static void main(String[] args) {
        // Устанавливаем значение n для тестирования
        int n = 3;

        // Вызываем метод fizzBuzz с параметром n
        fizzBuzz(n);
    }
}
