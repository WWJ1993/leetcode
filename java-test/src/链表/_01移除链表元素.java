package 链表;

import java.util.List;

public class _01移除链表元素 {
    public ListNode removeElements1(ListNode head, int val) {
        if (head == null) return head;
        ListNode newHead = new ListNode(0);
        ListNode node = head;
        ListNode preNode = newHead;
        while (node != null){
            if (node.val != val){

                    preNode.next = node;
                    preNode = node;

            }
            node = node.next;
        }
        preNode.next = null;
        return newHead;
    }

    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return head;
        ListNode newHead = new ListNode(0);
        ListNode preNode = newHead;
        ListNode node = head;
        while (node != null){
            if (node.val != val){
                preNode.next = node;
                preNode = node;
            }
            node = node.next;
        }
        preNode.next = null;
        return newHead.next;
    }


    public static void main(String[] args) {

        int[] list = new int[]{7,7,7,7};
//        int pos = 6;
//        ListNode posNode = null;
        ListNode head = new ListNode(list[0]);
        ListNode nextNode = head;
        for (int i = 1; i < list.length; i++) {
            nextNode.next = new ListNode(list[i]);
            nextNode = nextNode.next;
        }

        _01移除链表元素 a = new _01移除链表元素();
         a.removeElements(head,7);
    }
}
