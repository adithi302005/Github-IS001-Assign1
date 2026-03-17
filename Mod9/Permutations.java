package Mod9;


    // LeetCode 46 - Permutations

import java.util.*;

    public class Permutations {
        public static void main(String[] args) {
            int[] nums = {1, 2, 3};
            System.out.println(permute(nums));
        }

        public static List<List<Integer>> permute(int[] nums) {
            List<List<Integer>> res = new ArrayList<>();
            backtrack(res, new ArrayList<>(), nums);
            return res;
        }

        static void backtrack(List<List<Integer>> res, List<Integer> temp, int[] nums) {
            if (temp.size() == nums.length) {
                res.add(new ArrayList<>(temp));
                return;
            }

            for (int num : nums) {
                if (temp.contains(num)) continue;
                temp.add(num);
                backtrack(res, temp, nums);
                temp.remove(temp.size() - 1);
            }
        }
    }

