package com.anil.ds.stack;

public class StackDesign {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        minStack.getMin(); // return -3
        minStack.pop();
        minStack.top();    // return 0
        minStack.getMin(); // return -2
    }

}
class MinStack {

    public MinStack() {

    }

    public void push(int val) {

    }

    public void pop() {

    }

    public int top() {
        return -1;
    }

    public int getMin() {
        return -1;
    }
}