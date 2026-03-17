package Mod11;


    // LeetCode 232 - Implement Queue using Stacks

import java.util.*;

    public class QueueUsingStack {
        public static void main(String[] args) {
            MyQueue q = new MyQueue();
            q.push(1);
            q.push(2);

            System.out.println(q.pop()); // 1
        }
    }

    class MyQueue {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        public void push(int x) {
            s1.push(x);
        }

        public int pop() {
            if (s2.isEmpty())
                while (!s1.isEmpty()) s2.push(s1.pop());
            return s2.pop();
        }
    }

