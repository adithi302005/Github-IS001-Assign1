package Mod10;


    // LeetCode 876 - Middle of Linked List

    public class MiddleNode {

        static class ListNode {
            int val;
            ListNode next;
            ListNode(int v) { val = v; }
        }

        public static void main(String[] args) {
            ListNode head = new ListNode(1);
            head.next = new ListNode(2);
            head.next.next = new ListNode(3);

            System.out.println(middleNode(head).val); // 2
        }

        public static ListNode middleNode(ListNode head) {
            ListNode slow = head, fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }
    }

