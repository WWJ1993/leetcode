package 数组;

import java.util.Stack;



public class _10_155_最小栈 {
    Stack<Integer> stack,minStack;
    public _10_155_最小栈() {
        stack = new Stack();
        minStack = new Stack();
        minStack.push(Integer.MAX_VALUE);
    }

    public void push(int val) {
        stack.push(val);
        minStack.push(Math.min(minStack.peek(),val));
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
