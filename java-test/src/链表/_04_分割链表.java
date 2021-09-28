package 链表;
/*
* 86. 分隔链表
* https://leetcode-cn.com/problems/partition-list/
* */
public class _04_分割链表 {
    public ListNode partition(ListNode head, int x) {
        ListNode headA = new ListNode(0),curA = headA;
        ListNode headB = new ListNode(0),curB = headB;
        while (head != null){
            if (head.val<x){
                curA.next = head;
                curA = head;
            }else {
                curB.next = head;
                curB = head;
            }
            head = head.next;
        }
        curB.next = null;
        curA.next = headB.next;
        return headA.next;
    }
}
