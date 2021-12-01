package 链表;

public class _15_82_删除排序链表中的重复元素II {
    public ListNode deleteDuplicates(ListNode head) {

        ListNode dummyHead = new ListNode(-1);
        ListNode pre = dummyHead;
        while (head.next != null){
            if (head.val == head.next.val){
                while (head.next != null && head.val == head.next.val) head = head.next;
            }else {
                pre.next = head;
                pre = head;
            }
        }
        return dummyHead.next;




//        dummyHead.next = head;
//        ListNode cur = head;
//        while (cur.next != null && cur.next.next != null){
//            if (cur.next.val == cur.next.next.val){
//                while (cur.next.next != null && cur.next.val == cur.next.next.val){
//                    cur.next = cur.next.next.next;
//                }
//            }else {
//                cur = cur.next;
//            }
//        }
//        return dummyHead.next;
    }
}
