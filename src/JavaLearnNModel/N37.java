package JavaLearnNModel;

import java.util.Scanner;

//Создайте программу, которая проверяет, можно ли из введенного текста
//составить палиндром (перестановкой букв).
public class N37 {
    public static void main(String[] args) {
        System.out.println(isWordPolindrom("шалаш"));
        System.out.println(isWordPolindrom("racecar"));
        System.out.println(isWordPolindrom("Nursultan"));
        System.out.println(isWordPolindrom("121"));
    }

    private static boolean isWordPolindrom(String word) {
        var chars = word.toLowerCase().toCharArray();
        var left = 0; // первый символ
        var right = chars.length - 1; //последний символ
        while (left < right) { // то есть мы каждой итерации до тех пор пока они не совместятся,
            // совместятся коргда в середине

            if (chars[left] != chars[right]) { // символ равен или нет проверяем
                return false;
            }

            right--;
            left++; // ортага жиберемиз
        }
        return true;

    }
}

//package JavaLearnNModel;
//
//import java.util.HashMap;
//import java.util.Map;
//
//// Проверка, можно ли составить палиндром из перестановки букв
//public class N37 {
//    public static void main(String[] args) {
//        System.out.println(canFormPalindrome("шалаш"));    // true
//        System.out.println(canFormPalindrome("aabb"));     // true
//        System.out.println(canFormPalindrome("abc"));      // false
//        System.out.println(canFormPalindrome("121"));      // true
//    }
//
//    private static boolean canFormPalindrome(String word) {
//        // Приведение текста к нижнему регистру и удаление пробелов
//        word = word.toLowerCase().replaceAll("\\s+", "");
//
//        // Подсчет количества вхождений каждого символа
//        Map<Character, Integer> charCount = new HashMap<>();
//        for (char c : word.toCharArray()) {
//            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
//        }
//
//        // Проверка условий для палиндрома:
//        // В палиндроме максимум один символ может встречаться нечетное количество раз
//        int oddCount = 0;
//        for (int count : charCount.values()) {
//            if (count % 2 != 0) {
//                oddCount++;
//                if (oddCount > 1) {
//                    return false;
//                }
//            }
//        }
//        return true;
//    }
//}
