package Mod9;


    // LeetCode 22 - Generate Parentheses

import java.util.*;

    public class GenerateParentheses {
        public static void main(String[] args) {
            System.out.println(generateParenthesis(3));
        }

        public static List<String> generateParenthesis(int n) {
            List<String> res = new ArrayList<>();
            backtrack(res, "", 0, 0, n);
            return res;
        }

        static void backtrack(List<String> res, String str, int open, int close, int n) {
            if (str.length() == 2 * n) {
                res.add(str);
                return;
            }

            if (open < n)
                backtrack(res, str + "(", open + 1, close, n);

            if (close < open)
                backtrack(res, str + ")", open, close + 1, n);
        }
    }

