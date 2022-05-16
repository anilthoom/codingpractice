package com.anil.ds.stack;

import java.util.*;

//https://leetcode.com/problems/min-stack/
public class StackDesign {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-1);
        minStack.push(-2);
        minStack.push(-3);
        minStack.push(7);
        minStack.push(1);
        minStack.push(5);
        minStack.getMin(); // return -3
        minStack.pop();
        minStack.top();    // return 0
        System.out.println(minStack.getMin());
    }
}
class MinStack {
    List<Integer> stackList = new ArrayList<>();
    Set<Integer> sortedSet = new TreeSet<>();
    int min;
    public MinStack() {

    }

    public void push(int val) {
        if(val < min)
            min = val;
        stackList.add(val);
        sortedSet.add(val);
    }

    public void pop() {
        int removedElement = stackList.remove(stackList.size()-1);
        sortedSet.remove(removedElement);
    }

    public int top() {
        return stackList.get(stackList.size()-1);
    }

    public int getMin() {
        return (Integer)(((TreeSet) sortedSet).first());
    }
}