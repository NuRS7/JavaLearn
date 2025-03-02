package Neetcode;

public class LeetCode1768 {
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder builder = new StringBuilder();
        int i = 0;
        while (i < word1.length() || i < word2.length()) {

            if (i < word1.length()) {
                builder.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                builder.append(word2.charAt(i));
            }
            i++;
        }
        System.out.println(builder.toString());
        return builder.toString();
    }

    public static void main(String[] args) {
        mergeAlternately("Hello", "Hi");

    }
}
