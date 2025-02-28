package com.epam.rd.autotasks.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LocalMaximaRemove {
    public static void main(String[] args) {
        int[] array = {18, 1, 3, 6, 7, -5};
        System.out.println(Arrays.toString(removeLocalMaxima(array)));
        // Ожидаемый вывод: [1, 3, 6, -5]
    }

    public static int[] removeLocalMaxima(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Input array cannot be null");
        }
        if (array.length < 2) {
            return array.clone(); // Возвращаем копию, если массив слишком маленький
        }

        List<Integer> resultList = new ArrayList<>();
        int n = array.length;

        for (int i = 0; i < n; i++) {
            boolean isLocalMaxima = false;

            // Проверка первого элемента
            if (i == 0 && array[i] > array[i + 1]) {
                isLocalMaxima = true;
            }

            // Проверка последнего элемента
            else if (i == n - 1 && array[i] > array[i - 1]) {
                isLocalMaxima = true;
            }

            // Проверка средних элементов (как раньше)
            else if (i > 0 && i < n - 1 && array[i] > array[i - 1] && array[i] > array[i + 1]) {
                isLocalMaxima = true;
            }

            // Если не локальный максимум, добавляем в результат
            if (!isLocalMaxima) {
                resultList.add(array[i]);
            }
        }

        return resultList.stream().mapToInt(Integer::intValue).toArray();
    }
}
