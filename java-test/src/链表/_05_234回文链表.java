package 链表;
//https://leetcode-cn.com/problems/palindrome-linked-list/

public class _05_234回文链表 {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        if (head.next.next == null) return head.val == head.next.val;

        ListNode mid = middleNode(head);
        System.out.println("head:"+head);

        ListNode headA = head;
        ListNode headB = reverseList(mid.next);
        ListNode oldHeadB = headB;

        System.out.println(head);
        System.out.println("headA:"+headA);
        System.out.println("headB:"+headB);

        boolean result = true;
        while (headB != null){
            if (headB.val != headA.val){
                result = false;
                break;
            };
            headB= headB.next;
            headA = headA.next;
        }
        reverseList(oldHeadB);
        System.out.println("head:"+head);
        return result;
    }
    //找到中间节点
    private ListNode middleNode(ListNode head){
        ListNode fastNode = head;
        ListNode slowNode = head;
        while (fastNode.next != null && fastNode.next.next !=null){
            fastNode = fastNode.next.next;
            slowNode = slowNode.next;
        }
        return  slowNode;
    }
    //反转链表
    private ListNode reverseList(ListNode head){
        ListNode newHead = null;
        while (head != null){
            ListNode tmp = head.next;
            head.next = newHead;
            newHead = head;
            head = tmp;
        }
        return newHead;
    }

    public static void main(String[] args) {
        int[] list = new int[]{1,2,3,1};
        ListNode head = ListNode.getList(list);
        System.out.println(head);
        _05_234回文链表 a = new _05_234回文链表();
        boolean result = a.isPalindrome(head);
        System.out.println(result);
    }
}
