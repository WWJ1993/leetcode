class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode head1 = new ListNode();
        ListNode cur1 = head1;
        ListNode head2 = new ListNode();
        ListNode cur2 = head2;
        ListNode cur = head;
        while (cur != null) {
            if (cur.val < x) {
                cur1.next = cur;
                cur1 = cur1.next;
            } else {
                cur2.next = cur;
                cur2 = cur2.next;
            }
            cur = cur.next;
        }
        cur2.next = null;
        cur1.next = head2.next;
        return head1.next;

    }
}
