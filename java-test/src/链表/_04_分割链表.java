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

//    https://leetcode-cn.com/problems/partition-list-lcci/
//    不保留相对位置

//    public ListNode partition1(ListNode head, int x) {
//        if (head == null) return head;
//        ListNode newHead = new ListNode(0),preNode = newHead;
//        newHead.next = head;
//        while (head != null){
//            if (head.val<x){
//                //1、删除节点
//                preNode.next = head.next;
//                //1、将节点放到首部
//                ListNode tmpNextHead = head.next;
//                head.next = newHead.next;
//                newHead.next = head;
//                head = tmpNextHead;
//            }else {
//                preNode =  head;
//                head = head.next;
//            }
//
//        }
//
//        return newHead.next;
//    }


}
