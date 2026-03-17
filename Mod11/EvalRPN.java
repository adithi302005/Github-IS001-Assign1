package Mod11;

    // LeetCode 150 - Evaluate Reverse Polish Notation

import java.util.*;

    public class EvalRPN {
        public static void main(String[] args) {
            String[] tokens = {"2", "1", "+", "3", "*"};
            System.out.println(evalRPN(tokens)); // 9
        }

        public static int evalRPN(String[] tokens) {
            Stack<Integer> st = new Stack<>();

            for (String t : tokens) {
                if (t.equals("+")) st.push(st.pop() + st.pop());
                else if (t.equals("*")) st.push(st.pop() * st.pop());
                else if (t.equals("-")) {
                    int b = st.pop(), a = st.pop();
                    st.push(a - b);
                }
                else if (t.equals("/")) {
                    int b = st.pop(), a = st.pop();
                    st.push(a / b);
                }
                else st.push(Integer.parseInt(t));
            }
            return st.pop();
        }
    }

