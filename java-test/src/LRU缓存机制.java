import java.util.*;

/*
*
//* */
//LRUCache cache = new LRUCache( 2 /* 缓存容量 */ );
//
//        cache.put(1, 1);
//        cache.put(2, 2);
//        cache.get(1);       // 返回  1
//        cache.put(3, 3);    // 该操作会使得关键字 2 作废
//        cache.get(2);       // 返回 -1 (未找到)
//        cache.put(4, 4);    // 该操作会使得关键字 1 作废
//        cache.get(1);       // 返回 -1 (未找到)
//        cache.get(3);       // 返回  3
//        cache.get(4);       // 返回  4
//
//        来源：力扣（LeetCode）
//        链接：https://leetcode-cn.com/problems/lru-cache
//        著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
class LRUCache {
    Map<Integer,Integer> map ;
    int capacity = 0;
    Node firstNode = new Node(0);
    Node lastNode = new Node(0);
    private List<Integer> keys ;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>(this.capacity);
        keys = new LinkedList<>();
    }

    public int get(int key) {
        if (map.get(Integer.valueOf(key))<0){
            return -1;
        };

        return map.get(Integer.valueOf(key)).intValue();
    }

    public void put(int key, int value) {
        if (map.size() >= capacity){

        }else {

        }
        map.put(Integer.valueOf(key),Integer.valueOf(value));

    }

    private void remove(Node node){
        node.next.pret = node.pret;
        node.pret.next = node.next;
    };


//Runtime吗
    //蘑菇街
    //

}
class Node {
    Node next;
    Node pret;
    int key;
    int value;
    Node(int x) {
        value = x;
    }
}
