public class Solution {
    // 合并两个有序链表，分治
    public ListNode mergeKLists(ListNode[] lists) {
        return this.merge(lists, 0, lists.length - 1);
    }

    // 分治
    public ListNode merge(ListNode[] lists, int l, int r) {
        if (l == r)
            return lists[l];
        if (l > r)
            return null;
        int mid = (r + l) / 2;
        return mergeTwoLists(this.merge(lists, l, mid), this.merge(lists, mid + 1, r));
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyNode = new ListNode();
        ListNode cur1 = list1;
        ListNode cur2 = list2;

        ListNode cur = dummyNode;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                cur.next = cur1;
                cur1 = cur1.next;
            } else {
                cur.next = cur2;
                cur2 = cur2.next;
            }
            cur = cur.next;
        }
        cur.next = list1 == null ? list2 : list1;
        return dummyNode.next;
    }

    // K 个指针分别指向 K 条链表
    public ListNode mergeKLists1(ListNode[] lists) {
        ListNode dummyHead = new ListNode();
        ListNode cur = dummyHead;
        while (true) {
            ListNode minNode = new ListNode(Integer.MAX_VALUE);
            int minIndex = -1;
            for (int i = 0; i < lists.length; i++) {
                ListNode node = lists[i];
                if (node == null) {
                    continue;
                }
                if (node.val < minNode.val) {
                    minNode = node;
                    minIndex = i;
                }
            }
            if (minIndex == -1) {
                break;
            }
            cur.next = minNode;
            cur = cur.next;
            lists[minIndex] = lists[minIndex].next;
        }
        return dummyHead.next;

    }
}
