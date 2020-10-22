import java.util.ArrayList;
import java.util.List;

public class 环形链表 {
    static public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast){
            if (fast == null || fast.next == null) return false;
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] list = new int[]{3,2,0,-4};
        int pos = 6;
        ListNode posNode = null;
        ListNode head = new ListNode(list[0]);
        ListNode nextNode = head;
        for (int i = 1; i < list.length; i++) {
            nextNode.next = new ListNode(list[i]);
            nextNode = nextNode.next;
            if (i == pos){
                posNode = nextNode;
            }
            if (i == list.length-1){
                nextNode.next = posNode;
            }
        }
        System.out.println(hasCycle(head));
    }
}
