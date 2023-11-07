public class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null)
            return true;

        // 快慢指针找到中间节点
        ListNode midNode = this.middleNode(head);
        // 反转中间节点右边
        ListNode rightNode = this.reverseList(midNode.next);

        while (rightNode != null) {
            if (head.val != rightNode.val) {
                return false;
            }
            head = head.next;
            rightNode = rightNode.next;
        }
        return true;

    }

    public ListNode middleNode(ListNode head) {
        ListNode slowNode = head;
        ListNode fastNode = head;
        while (fastNode.next != null && fastNode.next.next != null) {
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
        }
        return slowNode;
    }

    public ListNode reverseList(ListNode head) {
        ListNode newHead = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }
}
