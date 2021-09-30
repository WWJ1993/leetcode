package 链表;
//https://leetcode-cn.com/problems/linked-list-cycle/
public class _08_141_环形链表 {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;
        ListNode slowNode = head;
        ListNode fastNode = head.next;
        while (slowNode != fastNode){
            if (fastNode == null||fastNode.next == null) return  false;
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
        }
        return true;
    }
}
