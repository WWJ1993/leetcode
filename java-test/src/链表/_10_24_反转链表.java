package 链表;
//https://leetcode-cn.com/problems/fan-zhuan-lian-biao-lcof/
public class _10_24_反转链表 {
    public ListNode reverseList(ListNode head) {
        ListNode newHead = null;
        while (head != null){
            ListNode tmp = head.next;
            head.next = newHead;
            newHead = head;
            head = tmp;
        }
        return newHead;
    }
}
