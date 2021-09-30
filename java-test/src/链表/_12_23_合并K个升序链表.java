package 链表;

public class _12_23_合并K个升序链表 {
    public ListNode mergeKLists(ListNode[] lists) {
        //分治
        return merge(lists,0,lists.length-1);

    }
    ListNode merge(ListNode[] lists, int l, int r) {
        if (l == r) return lists[l];
        if (l > r) return null;
        int mid = (l + r) >> 1;
        return mergeTwoLists(merge(lists, l, mid), merge(lists, mid + 1, r));
    }


    public ListNode mergeTwoLists(ListNode a, ListNode b) {
        if ( a == null ) return b;
        if ( b == null ) return a;

        ListNode head = new ListNode(0);
        ListNode curA = a;
        ListNode curB = b;
        ListNode curNew = head;
        while (curA != null && curB != null){
            if (curA.val<curB.val){
                curNew.next = curA;
                curA = curA.next;
            }else {
                curNew.next = curB;
                curB = curB.next;
            }
            curNew= curNew.next;
        }
        curNew.next = (curA != null?curA:curB);

        return head.next;
    }
}
