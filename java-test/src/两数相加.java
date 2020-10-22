
public class 两数相加 {
    static public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        ListNode dummyHead = new ListNode(0);
        ListNode last = dummyHead;
        int carry = 0;  //进位

        while (l1 != null || l2 != null){
            int val1 = 0;
            if (l1 != null){
                val1 = l1.val;
                l1 = l1.next;
            }
            int val2 = 0;
            if (l2 != null){
                val2 = l2.val;
                l2 = l2.next;
            }

            int sum = val1+val2+carry;
            carry = sum/10;
            last.next = new ListNode(sum%10);
            last = last.next;

        }
        if (carry > 0){
            last.next = new ListNode(carry);
        }
        return dummyHead.next;
    }

    public static void main(String[] args) {
        int[] list = new int[]{};
        int[] list1 = new int[]{};
        ListNode node = addTwoNumbers(ListNode.getList(list),ListNode.getList(list1));
        while (node != null){
            System.out.println(node.val);
            node = node.next;
        }

    }
}
