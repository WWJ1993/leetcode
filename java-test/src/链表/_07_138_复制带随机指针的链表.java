package 链表;

import java.util.HashMap;
import java.util.Map;

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }


}
public class _07_138_复制带随机指针的链表 {

    //方法一：使用HashMap缓存节点
    // 时间复杂度 O（n），空间复杂度O（n）

    Map<Node,Node> cachedNode = new HashMap<Node,Node>();
    public Node copyRandomList1(Node head) {
        if (head == null) return  head;
        if (!cachedNode.containsKey(head)){
            Node newHead = new Node(head.val);
            cachedNode.put(head,newHead);
            newHead.next = copyRandomList(head.next);
            newHead.random = copyRandomList(head.random);
        }

        return cachedNode.get(head);
    }

    //方法二：

    //
    public Node copyRandomList(Node head) {

        if (head == null) return  head;
        Node node = head;
        while (node != null){
            Node newNode = new Node(node.val);
            newNode.next = node.next;
            node.next = newNode;
            node = newNode.next;
        }
        node = head;
        while (node != null){
            Node newNode = node.next;
            newNode.random = (node.random == null)?null:node.random.next;
            node = newNode.next;
        }

        Node newHead = head.next;
        node = head;
        while (node != null){
            Node newNode = node.next;
            node.next = newNode.next;
            newNode.next = newNode.next == null ?null: newNode.next.next ;
            node = node.next;
        }

        return  newHead;
    }

    public static void main(String[] args) {
        Node head = new Node(0);
        (new  _07_138_复制带随机指针的链表()).copyRandomList(head);

    }


}
