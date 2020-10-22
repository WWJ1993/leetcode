import java.util.Stack;

public class 删除链表的倒数第N个节点 {
    static public ListNode removeNthFromEnd(ListNode head, int n) {
        int num = 0;
        ListNode first = head;
        ListNode second = head;
        ListNode preNode = head;

        while (first != null){
            first = first.next;
            if (num >= n){
                preNode = second;
                second = second.next;
            }
            num++;
        }
        if (n == num){//删除的是head
            head = head.next;
        }else if (preNode != null) preNode.next = second.next;

        return head;

    }

    public static void main(String[] args) {
        int[] list = new int[]{1,2};

        ListNode head = ListNode.getList(list);
        head = removeNthFromEnd(head,2);
        while (head != null){
            System.out.println(head.val);
            head = head.next;
        }
    }
}
