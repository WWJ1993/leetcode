package 链表;

public class _09_142_环形链表II {
    public ListNode detectCycle(ListNode head) {
        if (head == null) return head;

        ListNode slowNode = head;
        ListNode fastNode = head;
        while (fastNode != null){
            if (fastNode.next == null) return null;
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
            if (slowNode == fastNode){ //相遇，从头走，与慢指针相遇
                ListNode prt = head;
                while (prt != slowNode){
                    prt = prt.next;
                    slowNode = slowNode.next;
                }
                return prt;
            }
        }
        return null;

    }
}
