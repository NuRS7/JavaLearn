package Neetcode;

public class LeetCode1071 {
    //    public static String gcdOfStrings(String str1, String str2) {
//        int[] charCount = new int[26];
//
//        for (char c : str1.toCharArray()) {
//            charCount[c - 'A']++;
//        }
//
//        for (char c : str2.toCharArray()) {
//            if (charCount[c - 'A'] == 0) {
//                return "";
//            }
//            charCount[c - 'A']--;
//        }
//        System.out.println(charCount.toString());
//        return charCount.toString();
//
//    }
//    public static void main(String[] args) {
//        gcdOfStrings("ABCABC", "ABC");
//    }
        public static String gcdOfStrings(String str1, String str2) {
             if (str1.length() < str2.length()) {
                return gcdOfStrings(str2, str1); // Меняем порядок строк
            } else if (!str1.startsWith(str2)) {
                return ""; // Если str1 не начинается с str2, НОД строк не существует
            } else if (str2.isEmpty()) {
                return str1; // Когда вторая строка пустая, результат — первая строка
            }
            return gcdOfStrings(str1.substring(str2.length()), str2); // Убираем повторяющуюся часть
        }

        public static void main(String[] args) {
            String result = gcdOfStrings("ABABAB", "ABAB"); // Ожидаемый результат: "AB"
            System.out.println(result);
        }
    }
