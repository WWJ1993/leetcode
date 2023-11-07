class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;

        int carry = 0;
        ListNode dummyHead = new ListNode();
        ListNode nextNode = dummyHead;
        while (l1 != null || l2 != null) {

            int val1 = l1 == null ? 0 : l1.val;
            int val2 = l2 == null ? 0 : l2.val;
            int all = val1 + val2 + carry;
            int val = all % 10;
            carry = all / 10;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
            ListNode node = new ListNode(val);
            nextNode.next = node;
            nextNode = nextNode.next;
        }
        // 最后进位>0 的处理
        if (carry > 0) {
            nextNode.next = new ListNode(carry);
        }
        return dummyHead.next;
    }
}
