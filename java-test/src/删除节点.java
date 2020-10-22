public class 删除节点 {

    public void test(ListNode node){
        if (node == null) return;

        ListNode nextNode = node.next;
        ListNode preNode = node.pre;
        if (nextNode != null){
            nextNode.pre = preNode;
        }
        if (preNode != null){
            preNode.next = nextNode;
        }


//        音视频
//        Socket


//        while (node != null){
//            if (nextNode == node){
//                ListNode next =  nextNode.next;
//                next.pre =
//                nextNode.pre = nextNode.next;
//
//            }
//            nextNode = nextNode.next;
//        }
    }

}
