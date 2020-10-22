import org.w3c.dom.NodeList;

public class 重排链表 {

//    static public void reorderList(ListNode head) {
//        if (head == null) {
////            return;
////        }
//        ListNode mid = middleNode(head);
//        ListNode l1 = head;
//        ListNode l2 = mid.next;
//        mid.next = null;
//        l2 = reverseList(l2);
//        mergeList(l1, l2);
//    }
//
//    static public ListNode middleNode(ListNode head) {
//        ListNode slow = head;
//        ListNode fast = head;
//        while (fast.next != null && fast.next.next != null) {
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//        return slow;
//    }
//
//    static public ListNode reverseList(ListNode head) {
//        ListNode prev = null;
//        ListNode curr = head;
//        while (curr != null) {
//            ListNode nextTemp = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = nextTemp;
//        }
//        return prev;
//    }
//
//    static public void mergeList(ListNode l1, ListNode l2) {
//        ListNode l1_tmp;
//        ListNode l2_tmp;
//        while (l1 != null && l2 != null) {
//            l1_tmp = l1.next;
//            l2_tmp = l2.next;
//
//            l1.next = l2;
//            l1 = l1_tmp;
//
//            l2.next = l1;
//            l2 = l2_tmp;
//        }
//    }

//    作者：LeetCode-Solution
//    链接：https://leetcode-cn.com/problems/reorder-list/solution/zhong-pai-lian-biao-by-leetcode-solution/
//    来源：力扣（LeetCode）
//    著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
//
//
//
//
    static public void reorderList(ListNode head) {





        ListNode firstNode = head.next;
        ListNode secondNode = getReorderList(getMidNode(head));
        ListNode node = head;

//        int num = 0;
        while (node.next != null && firstNode != null && secondNode != null){
//            firstNode = firstNode.next;
//            secondNode = secondNode.next;
            node.next = firstNode;
            firstNode = firstNode.next;
            node = node.next;
            node.next = secondNode;
            secondNode = secondNode.next;
            node = node.next;


//            if ((num&1) == 1){
//
//            }else {
//
//            }
//            node = node.next;
//            num++;
//            node.next = ((num&1) == 1)?secondNode.next:firstNode.next;
//            node = node.next;
        }

//        int num = 0;
//        preNode = head;
//        while (preNode != null) {
//            head.next = ((num&1) == 1)?secHead.next:preNode.next;
//            secHead = secHead.next;
//
//        }

    }

    static ListNode getMidNode(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null&&fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    static ListNode getReorderList(ListNode head){
        ListNode curNode = head;
        ListNode prev = null;

        //反转
        while (curNode != null){
            ListNode tmpNode = curNode.next;
            curNode.next = prev;
            prev = curNode;
            curNode = tmpNode;
        }
        return prev;
    }



    public static void main(String[] args) {
        int[] list = new int[]{1,2,3,4};
        ListNode head = ListNode.getList(list);

        reorderList(head);
        while (head != null){
            System.out.println(head.val);
            head = head.next;
        }


    }
}
