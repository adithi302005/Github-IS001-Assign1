package Mod9;

    // LeetCode 39 - Combination Sum

import java.util.*;

    public class CombinationSum {
        public static void main(String[] args) {
            int[] nums = {2, 3, 6, 7};
            int target = 7;
            System.out.println(combinationSum(nums, target));
        }

        public static List<List<Integer>> combinationSum(int[] nums, int target) {
            List<List<Integer>> res = new ArrayList<>();
            backtrack(res, new ArrayList<>(), nums, target, 0);
            return res;
        }

        static void backtrack(List<List<Integer>> res, List<Integer> temp, int[] nums, int target, int start) {
            if (target == 0) {
                res.add(new ArrayList<>(temp));
                return;
            }

            for (int i = start; i < nums.length; i++) {
                if (nums[i] > target) continue;
                temp.add(nums[i]);
                backtrack(res, temp, nums, target - nums[i], i);
                temp.remove(temp.size() - 1);
            }
        }
    }

