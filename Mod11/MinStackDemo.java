package Mod11;


    // LeetCode 155 - Min Stack

import java.util.*;

    public class MinStackDemo {
        public static void main(String[] args) {
            MinStack st = new MinStack();
            st.push(3);
            st.push(1);
            st.push(2);

            System.out.println(st.getMin()); // 1
        }
    }

    class MinStack {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> minStack = new Stack<>();

        public void push(int val) {
            stack.push(val);
            if (minStack.isEmpty() || val <= minStack.peek())
                minStack.push(val);
        }

        public void pop() {
            if (stack.pop().equals(minStack.peek()))
                minStack.pop();
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return minStack.peek();
        }
    }

