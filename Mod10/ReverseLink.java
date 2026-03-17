package Mod10;

public class ReverseLink {


        static class ListNode {
            int val;
            ListNode next;
            ListNode(int v) { val = v; }
        }

        public static void main(String[] args) {
            ListNode head = new ListNode(1);
            head.next = new ListNode(2);

            head = reverseList(head);

            while (head != null) {
                System.out.print(head.val + " ");
                head = head.next;
            }
        }

        public static ListNode reverseList(ListNode head) {
            ListNode prev = null;

            while (head != null) {
                ListNode next = head.next;
                head.next = prev;
                prev = head;
                head = next;
            }
            return prev;
        }
    }



