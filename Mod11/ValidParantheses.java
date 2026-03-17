package Mod11;

import java.util.Stack;

public class ValidParantheses {
    // LeetCode 20 - Valid Parentheses

        public static void main(String[] args) {
            String s = "()[]{}";

            System.out.println(isValid(s)); // true
        }

        public static boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();

            for (char c : s.toCharArray()) {
                if (c == '(' || c == '{' || c == '[')
                    stack.push(c);
                else {
                    if (stack.isEmpty()) return false;

                    char top = stack.pop();

                    if ((c == ')' && top != '(') ||
                            (c == '}' && top != '{') ||
                            (c == ']' && top != '['))
                        return false;
                }
            }

            return stack.isEmpty();
        }
    }



