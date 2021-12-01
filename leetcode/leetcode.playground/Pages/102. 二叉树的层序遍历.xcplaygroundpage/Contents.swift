

public class TreeNode {
    public var val: Int
    public var left: TreeNode?
    public var right: TreeNode?
    public init() { self.val = 0; self.left = nil; self.right = nil; }
    public init(_ val: Int) { self.val = val; self.left = nil; self.right = nil; }
    public init(_ val: Int, _ left: TreeNode?, _ right: TreeNode?) {
        self.val = val
        self.left = left
        self.right = right
    }
}

class Solution {
    func levelOrder(_ root: TreeNode?) -> [[Int]] {
        var array = [Array<Int>]();
        var queue = [TreeNode]()
        queue.append(root!)
        while(!queue.isEmpty){
            var subArray = [Int]()
            let num = queue.count;
            for _ in 0..<num {
                let node = queue.removeFirst()
                subArray.append(node.val);
                print(node.val)
                if(node.left != nil) {queue.append(node.left!)}
                if(node.right != nil) {queue.append(node.right!)}
            }
            array.append(subArray);
        }
        return array;
    }
}

var cls = Solution();
var root = TreeNode(0);
cls.levelOrder(root);

