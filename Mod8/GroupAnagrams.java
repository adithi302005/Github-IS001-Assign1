package Mod8;


    // LeetCode 49 - Group Anagrams

import java.util.*;

    public class GroupAnagrams {
        public static void main(String[] args) {
            String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

            List<List<String>> result = groupAnagrams(strs);

            System.out.println(result);
        }

        public static List<List<String>> groupAnagrams(String[] strs) {
            Map<String, List<String>> map = new HashMap<>();

            for (String s : strs) {
                char[] arr = s.toCharArray();
                Arrays.sort(arr);              // sort letters
                String key = new String(arr);  // use as key

                if (!map.containsKey(key))
                    map.put(key, new ArrayList<>());

                map.get(key).add(s);
            }

            return new ArrayList<>(map.values());
        }
    }

