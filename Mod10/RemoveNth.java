package Mod10;

    // LeetCode 19 - Remove Nth Node From End

    public class RemoveNth {

        static class ListNode {
            int val;
            ListNode next;
            ListNode(int v) { val = v; }
        }

        public static void main(String[] args) {
            ListNode head = new ListNode(1);
            head.next = new ListNode(2);

            head = removeNthFromEnd(head, 1);

            while (head != null) {
                System.out.print(head.val + " ");
                head = head.next;
            }
        }

        public static ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode dummy = new ListNode(0);
            dummy.next = head;

            ListNode fast = dummy, slow = dummy;

            for (int i = 0; i <= n; i++) fast = fast.next;

            while (fast != null) {
                fast = fast.next;
                slow = slow.next;
            }

            slow.next = slow.next.next;
            return dummy.next;
        }
    }

