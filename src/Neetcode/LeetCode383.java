package Neetcode;

public class LeetCode383 {
        public static boolean canConstruct(String ransomNote, String magazine) {
            int[] charCount = new int[26]; // Array to count occurrences of each letter in magazine

            // Count characters in magazine
            for (char c : magazine.toCharArray()) {
                charCount[c - 'a']++;
            }

            // Check if ransomNote can be constructed
            for (char c : ransomNote.toCharArray()) {
                if (charCount[c - 'a'] == 0) { // If character is unavailable
                    return false;
                }
                charCount[c - 'a']--; // Use one occurrence of the character
            }

            return true;
        }

        public static void main(String[] args) {
            String ransomNote1 = "aa";
            String magazine1 = "aab";
            System.out.println("Can construct? " + canConstruct(ransomNote1, magazine1)); // true

            String ransomNote2 = "aab";
            String magazine2 = "abc";
            System.out.println("Can construct? " + canConstruct(ransomNote2, magazine2)); // false

            String ransomNote3 = "hello";
            String magazine3 = "hlellohe";
            System.out.println("Can construct? " + canConstruct(ransomNote3, magazine3)); // true
        }
    }

