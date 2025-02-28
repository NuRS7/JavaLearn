package EPAM.arrays;

import java.util.Arrays;

public class Sorting4 {
    public static void sortArrays(char[] letters, int[] numbers) {
        int n = letters.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                // Если буква "больше", меняем местами
                if (letters[j] > letters[j + 1] ||
                        (letters[j] == letters[j + 1] && numbers[j] > numbers[j + 1])) {

                    // Меняем буквы местами
                    char tempChar = letters[j];
                    letters[j] = letters[j + 1];
                    letters[j + 1] = tempChar;

                    // Меняем числа местами
                    int tempNum = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = tempNum;
                }
            }
        }
    }

    public static void main(String[] args) {
        // Жестко заданные входные данные
        String input = "a b a b;1 2 3 4";

        // Разделяем на части
        String[] inputParts = input.split(";");

        // Читаем массив букв
        String[] letterStrings = inputParts[0].split(" ");
        char[] letters = new char[letterStrings.length];
        for (int i = 0; i < letterStrings.length; i++) {
            letters[i] = letterStrings[i].charAt(0);
        }

        // Читаем массив чисел
        String[] numStrings = inputParts[1].split(" ");
        int[] numbers = new int[numStrings.length];
        for (int i = 0; i < numStrings.length; i++) {
            numbers[i] = Integer.parseInt(numStrings[i]);
        }

        // Сортируем массивы
        sortArrays(letters, numbers);

        // Выводим отсортированные массивы
        System.out.println(Arrays.toString(letters)+","+ Arrays.toString(numbers));
    }
}
