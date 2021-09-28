package 链表;

public class _03_160相交链表 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode curA = headA,curB = headB;
        while (curA!=curB){
            curA = (curA == null) ?headB:curA.next;
            curB = (curB == null) ?headA:curB.next;
        }
        return curA;
    }
}
