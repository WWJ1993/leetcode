package 链表;

public class _13_21_合并两个有序链表 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode head = new ListNode(0);
        ListNode cur = head, cur1 = l1,cur2 = l2;
        while(cur1 != null && cur2 != null){
            if(cur1.val<cur2.val){
                cur.next = cur1;
                cur1 = cur1.next;
            }else{
                cur.next = cur2;
                cur2 = cur2.next;
            }
            cur = cur.next;
        }
        cur.next = cur1 != null?cur1:cur2;
        return head.next;
    }

    public static void main(String[] args) {

        (new _13_21_合并两个有序链表()).mergeTwoLists(new ListNode(1),new ListNode(2));
    }
}
