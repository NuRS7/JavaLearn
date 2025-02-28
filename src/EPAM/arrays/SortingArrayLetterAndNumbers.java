package EPAM.arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class SortingArrayLetterAndNumbers {
    public static void main(String[] args) {
        // Данный массив
        String[] input = {"a", "1", "gf", "a", "1", "f", "23"};

        List<String> letters = new ArrayList<>();
        List<Integer> numbers = new ArrayList<>();

        // Разделяем на буквы и числа
        for (String s : input) {
            if (s.matches("[a-zA-Z]+")) {  // Проверяем, что строка состоит только из букв
                letters.add(s);
            } else {
                try {
                    // Пытаемся преобразовать строку в число
                    numbers.add(Integer.parseInt(s));
                } catch (NumberFormatException e) {
                    // Если это не число, то пропускаем
                }
            }
        }

        // Сортируем буквы по алфавиту
        letters.sort(String::compareTo);

        // Сортируем числа по порядку
        numbers.sort(Integer::compareTo);

        // Выводим отсортированные массивы
        System.out.println("Буквы: " + letters);
        System.out.println("Числа: " + numbers);
    }
}