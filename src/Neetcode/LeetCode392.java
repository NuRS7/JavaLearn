package Neetcode;

public class LeetCode392 {
    public static boolean isSubsequence(String s, String t) {
        int pointerS = 0, pointerT = 0;

        while (pointerS < s.length() && pointerT < t.length()) {
            if (s.charAt(pointerS) == t.charAt(pointerT) && pointerS < s.length()) {
                pointerS++;
            }
            pointerT++;
        }

        return pointerS == s.length();
    }

    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
    }
}
