public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummyHead = new ListNode();
        dummyHead.next = head;
        ListNode pre = dummyHead;
        ListNode end = dummyHead;

        while (cur.next != null) {
            for (int i = 0; i < k && end != null; i++) {
                cur = cur.next;
            }
            ListNode start = pre.next;
            ListNode next = end.next;
            end.next = null;
            pre.next = this.reverseList(start);
            start.next = next;

            pre = start;
            end = pre;
        }
        return dummyHead.next;
    }

    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return newHead;
    }
}
