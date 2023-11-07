public class Solution {
    public int kthToLast(ListNode head, int k) {
        int idx = 0;
        ListNode cur = head;
        while (head != null) {
            if (idx >= k) {
                cur = cur.next;
            }
            idx++;
            head = head.next;
        }
        return cur.val;
    }
}
