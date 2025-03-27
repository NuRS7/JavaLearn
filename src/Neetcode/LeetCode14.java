package Neetcode;

import java.util.Arrays;

public class LeetCode14 {
    public static String longestCommonPrefix(String[] strs) {
        StringBuffer sb = new StringBuffer();
        Arrays.sort(strs);
        String prefix = strs[0];
        String suffix = strs[strs.length - 1];
        for (int i = 0; i < Math.min(prefix.length(), suffix.length()); i++) {
            if (prefix.charAt(i) != suffix.charAt(i)) {
                return sb.toString();
            }

            sb.append(prefix.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String[] strings = {"flower", "flow", "flight"};
        longestCommonPrefix(strings);
    }
}
