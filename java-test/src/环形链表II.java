import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class 环形链表II {
    //空间复杂度n
    //时间复杂度O（n）
    public ListNode detectCycle1(ListNode head) {
        Set set = new HashSet();
        ListNode nextNode = head;
        while (nextNode != null){
            if (set.contains(nextNode.next)){
                return nextNode.next;
            }
            set.add(nextNode);
            nextNode = nextNode.next;
        }
        return null;
    }

    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode ptr = head;

        while (fast != null){
            if (fast.next == null) return null;
            slow = slow.next;
            fast = fast.next.next;
            //相遇
            if (fast == slow){
                while (ptr != slow){
                    ptr = ptr.next;
                    slow = slow.next;
                }
                return ptr;
            }
        }
        return null;
    }

    public static void main(String[] args) {

    }
}
