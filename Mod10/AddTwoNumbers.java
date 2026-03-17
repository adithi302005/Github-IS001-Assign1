package Mod10;

    // LeetCode 2 - Add Two Numbers

    public class AddTwoNumbers {

        static class ListNode {
            int val;
            ListNode next;
            ListNode(int v) { val = v; }
        }

        public static void main(String[] args) {
            ListNode l1 = new ListNode(2);
            l1.next = new ListNode(4);

            ListNode l2 = new ListNode(5);
            l2.next = new ListNode(6);

            ListNode res = addTwoNumbers(l1, l2);

            while (res != null) {
                System.out.print(res.val + " ");
                res = res.next;
            }
        }

        public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode dummy = new ListNode(0);
            ListNode curr = dummy;
            int carry = 0;

            while (l1 != null || l2 != null || carry != 0) {
                int sum = carry;

                if (l1 != null) { sum += l1.val; l1 = l1.next; }
                if (l2 != null) { sum += l2.val; l2 = l2.next; }

                curr.next = new ListNode(sum % 10);
                carry = sum / 10;
                curr = curr.next;
            }

            return dummy.next;
        }
    }

