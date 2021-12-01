package 链表;

import java.util.HashMap;
import java.util.HashSet;

public class _14_83_删除排序链表中的重复元素 {
    public ListNode deleteDuplicates(ListNode head) {

        ListNode pre = head;
        ListNode cur = head.next;
        while (cur != null){
            if (cur.val == pre.val){
                pre.next = cur.next;
            }else {
                pre = cur;
            }
            cur = cur.next;
        }
        return head;
    }
}
