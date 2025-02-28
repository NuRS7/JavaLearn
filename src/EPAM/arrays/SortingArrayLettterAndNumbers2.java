package EPAM.arrays;

import java.util.ArrayList;
import java.util.List;

public class SortingArrayLettterAndNumbers2 {

    public static void main(String[] args) {
        String[] input = {"a", "1", "gf", "a", "1", "f", "23"};
        List<String> Letters = new ArrayList<>();
        List<String> Numbers = new ArrayList<>();

        for (String s : input) {
            if (s.matches("[A-Za-z]+")) {
                Letters.add(s);

            } else {
                try {
                    Numbers.add(Integer.parseInt(s) + "");
                } catch (NumberFormatException ignored) {

                }
            }
            Letters.sort(String::compareTo);
            Numbers.sort(String::compareTo);

            // Сортируем числа по порядку

            // Выводим отсортированные массивы

        }
        System.out.println("Буквы: " + Letters);
        System.out.println("Числа: " + Numbers);
    }
}
