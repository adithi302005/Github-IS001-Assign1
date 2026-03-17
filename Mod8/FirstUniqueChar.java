package Mod8;


    // LeetCode 387 - First Unique Character in a String

    public class FirstUniqueChar {
        public static void main(String[] args) {
            String s = "leetcode";

            System.out.println(firstUniqChar(s)); // 0
        }

        public static int firstUniqChar(String s) {
            int[] count = new int[26];

            for (char c : s.toCharArray())
                count[c - 'a']++;

            for (int i = 0; i < s.length(); i++) {
                if (count[s.charAt(i) - 'a'] == 1)
                    return i;
            }

            return -1;
        }
    }
