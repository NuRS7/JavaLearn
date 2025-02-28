package Neetcode;

import java.util.Arrays;

public class D2 {
    public static void main(String[] args) {

        String s = "racecar";
        String t = "carrace";
        if (s.length() != t.length()) {
            System.out.println("False");

        }

        char[] sSort = s.toCharArray();
        char[] tSort = t.toCharArray();
        Arrays.sort(sSort);
        Arrays.sort(tSort);
        if (Arrays.equals(sSort, tSort)) {
            System.out.println("Yes");

        }


    }
}
