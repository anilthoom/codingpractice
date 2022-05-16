package com.anil.ds.stack;

import java.util.*;

//https://leetcode.com/problems/min-stack/
public class StackDesign {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(0);
        minStack.push(1);
        minStack.push(0);
        minStack.getMin();
        minStack.pop();
        minStack.top();
        System.out.println(minStack.getMin());
    }
}
class MinStack {
    List<Integer> stackList = new ArrayList<>();
    Set<Integer> sortedSet = new TreeSet<>();
    PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
    int min;
    public MinStack() {

    }

    public void push(int val) {
        if(val < min)
            min = val;
        stackList.add(val);
        sortedSet.add(val);
        priorityQueue.add(val);
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