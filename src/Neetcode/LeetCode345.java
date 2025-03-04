package Neetcode;

import java.util.*;

public class LeetCode345 {
    public static String reverseVowels(String s) {
        char[] arr = s.toCharArray(); // Преобразуем строку в массив символов
        int left = 0, right = arr.length - 1; // Два указателя
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u',
                'A', 'E', 'I', 'O', 'U'));

        while (left < right) {
            // Двигаем левый указатель, пока не найдём гласную
            while (left < right && !vowels.contains(arr[left])) {
                left++;
            }
            // Двигаем правый указатель, пока не найдём гласную
            while (left < right && !vowels.contains(arr[right])) {
                right--;
            }


            // Меняем местами гласные/
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Сдвигаем оба указателя внутрь
            left++;
            right--;
        }

        return new String(arr); // Преобразуем массив обратно в строку
    }

    public static void main(String[] args) {
        String s = "IceCreAm";
        System.out.println(reverseVowels(s));  // Вывод: "AceCreIm"
    }
}
