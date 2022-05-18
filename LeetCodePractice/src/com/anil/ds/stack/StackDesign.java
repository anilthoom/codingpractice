package com.anil.ds.stack;

import java.util.*;

//https://leetcode.com/problems/min-stack/
public class StackDesign {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(3);
        minStack.push(1);
        minStack.push(3);
        minStack.getMin();
        minStack.pop();
        minStack.top();
        System.out.println(minStack.getMin());
    }
}
class MinStack {
    List<Integer> stackList = new ArrayList<>();
    List<Integer> sortedList = new ArrayList<>();
    SortedMap<Integer, Integer> sortedMap = new TreeMap<Integer, Integer>();
    int min;
    public MinStack() {

    }

    public void push(int val) {
        if(val < min)
            min = val;
        stackList.add(val);
        sortedMap.put(sortedList.size()-1, val);
        sortedList.add(val);
    }

    public void pop() {
        int removedElement = stackList.remove(stackList.size()-1);
//        sortedList.remove(removedElement);
        sortedList.remove(Integer.parseInt(""+removedElement));
    }

    public int top() {
        return stackList.get(stackList.size()-1);
    }

    public int getMin() {
        Collections.sort(sortedList);
        return sortedList.get(0);
    }
}