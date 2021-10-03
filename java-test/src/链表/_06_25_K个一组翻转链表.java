package 链表;
//https://leetcode-cn.com/problems/reverse-nodes-in-k-group/
public class _06_25_K个一组翻转链表 {

    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || k == 1) return head;
        ListNode virtualHead = new ListNode(0);
        virtualHead.next = head;
        ListNode curNode = virtualHead;
        ListNode preNode = virtualHead;
        int num = 0;
        for (int i = 0; i < k; i++) {
            if (num == k-1){
                ListNode numNode = curNode;
                for (int j = 0; j < k; j++) {
                    if (numNode == null) return  virtualHead.next;
                    numNode = numNode.next;
                }
                preNode = curNode;
                curNode = curNode.next;
                i = 0;
            }
            ListNode next = curNode.next;
            curNode.next = next.next;
            next.next = preNode.next;
            preNode.next = next;

        }

        return  virtualHead.next;
    }
}
