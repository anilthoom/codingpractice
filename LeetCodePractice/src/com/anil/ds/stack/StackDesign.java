package com.anil.ds.stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/min-stack/
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
    List<Integer> stackList = new ArrayList<>();
    int min;
    public MinStack() {

    }

    public void push(int val) {
        if(val < min)
            min = val;
        stackList.add(val);
    }

    public void pop() {
        stackList.remove(stackList.size()-1);
        Object arr[] = stackList.toArray();
        Arrays.stream(arr).sorted();
        System.out.println(arr);
    }

    public int top() {
        return stackList.get(stackList.size()-1);
    }

    public int getMin() {
        return -1;
    }
}