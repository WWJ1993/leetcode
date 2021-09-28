package 链表;

public class ListNode {
    int val;
    ListNode next;
    ListNode pre;
    ListNode(int x) {
        val = x;
        next = null;
    }

    static public ListNode getList(int[] list){
        if (list.length == 0||list == null) return new ListNode(0);
        ListNode head = new ListNode(list[0]);
        ListNode nextNode = head;
        for (int i = 1; i < list.length; i++) {
            nextNode.next = new ListNode(list[i]);
            nextNode = nextNode.next;
        }
        return head;
    }

    @Override
    public String toString() {
        return  val + "->" + next ;
    }
}
