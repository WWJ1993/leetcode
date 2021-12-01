package 高频题;

import java.util.Stack;

public class _15_232_用栈实现队列 {
    Stack<Integer> pushStack;
    Stack<Integer> popStack;
    public _15_232_用栈实现队列() {
        pushStack = new Stack();
        popStack = new Stack();
    }

    public void push(int x) {
        pushStack.push(x);
    }

    public int pop() {
        while (!pushStack.isEmpty()) popStack.push(pushStack.pop());
        return popStack.pop();
    }

    public int peek() {
        while (!pushStack.isEmpty()) popStack.push(pushStack.pop());
        return popStack.peek();
    }

    public boolean empty() {
        return pushStack.isEmpty()&&popStack.isEmpty();
    }
}
