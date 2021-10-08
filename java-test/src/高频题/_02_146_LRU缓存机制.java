package 高频题;

import java.util.HashMap;

public class _02_146_LRU缓存机制 {
    HashMap<Integer, Node> map;
    Node head;
    Node last;
    int capacity;
    public _02_146_LRU缓存机制(int capacity) {
        this.map = new HashMap();
        this.head = new Node(0,0);
        this.last = new Node(0,0);
        this.head.next = last;
        this.last.pre = head;
        this.capacity = capacity;
    }

    public int get(int key) {
        Node node =  this.map.get(key);
        if (node == null) return  -1;
        removeNode(node);
        moveToHead(node);
        return node.value;
    }

    public void put(int key, int value) {
        Node node = map.get(key);
        if (node == null){
            if (map.size()==this.capacity){
                Node lastNode = map.remove(last.pre.key);
                removeNode(lastNode);
            }
            node = new Node(key,value);
            map.put(key,node);
        }else {
            node.value = value;
            removeNode(node);
        }
        moveToHead(node);
    }

    void removeNode(Node node){
        node.pre.next = node.next;
        node.next.pre = node.pre;
    }


    void  moveToHead(Node node){
        node.next = head.next;
        head.next.pre = node;
        head.next = node;
        node.pre = head;
    }
}
class  Node{
    int key;
    int value;
    Node next;
    Node pre;
    Node(int key,int value){
        this.key = key;
        this.value = value;
        this.next = null;
        this.pre = null;
    }
}

