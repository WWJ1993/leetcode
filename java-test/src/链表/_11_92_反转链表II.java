package 链表;

public class _11_92_反转链表II {
    public ListNode reverseBetween1(ListNode head, int left, int right) {
        if (head == null) return head;
        ListNode virtualHead = new ListNode(0);
        virtualHead.next = head;
        ListNode node = head;
        ListNode preNode = virtualHead;
        int cur = 1;
        while (node != null){
            if (cur == left){
//                ListNode leftNode = node;
                ListNode subNode = node;
                ListNode newHead = null;
                while (subNode != null){
                    //反转链表
                    ListNode tmp = subNode.next;
                    subNode.next = newHead;
                    newHead = subNode;
                    if (cur == right){
//                        ListNode rightNode = newHead;
                        preNode.next = newHead;
                        node.next = tmp;
                        return virtualHead.next;
                    }
                    subNode = tmp;
                    cur += 1;
                }
            }
            preNode = node;
            node = node.next;
             cur += 1;
        }
        return  virtualHead.next;

    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null) return head;
        ListNode virtualHead = new ListNode(0);
        virtualHead.next = head;
        ListNode curNode = head;
        ListNode preNode = virtualHead;
        for (int i = 1; i < left; i++) {
            preNode = preNode.next;
        }
        curNode = preNode.next;
        for (int i = left; i < right; i++) {
            //反转
            ListNode next = curNode.next;
            curNode.next = next.next;
            next.next = preNode.next;
            preNode.next = next;
        }

        return  virtualHead.next;

    }
}
