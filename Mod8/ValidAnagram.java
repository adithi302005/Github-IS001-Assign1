package Mod8;


    // LeetCode 242 - Valid Anagram

    public class ValidAnagram {
        public static void main(String[] args) {
            String s = "anagram";
            String t = "nagaram";

            System.out.println(isAnagram(s, t)); // true
        }

        public static boolean isAnagram(String s, String t) {
            if (s.length() != t.length()) return false;

            int[] count = new int[26];

            for (char c : s.toCharArray())
                count[c - 'a']++;

            for (char c : t.toCharArray())
                count[c - 'a']--;

            for (int i : count)
                if (i != 0) return false;

            return true;
        }
    }

