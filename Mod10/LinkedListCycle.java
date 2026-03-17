package Mod10;


    // LeetCode 141 - Linked List Cycle

    public class LinkedListCycle {

        static class ListNode {
            int val;
            ListNode next;
            ListNode(int v) { val = v; }
        }

        public static void main(String[] args) {
            ListNode head = new ListNode(1);
            head.next = new ListNode(2);
            head.next.next = head; // cycle

            System.out.println(hasCycle(head)); // true
        }

        public static boolean hasCycle(ListNode head) {
            ListNode slow = head, fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;

                if (slow == fast) return true;
            }
            return false;
        }
    }

