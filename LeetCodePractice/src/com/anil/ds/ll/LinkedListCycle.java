package com.anil.ds.ll;

import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/linked-list-cycle/
public class LinkedListCycle {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode two = new ListNode(2);
        head.next = two;
        ListNode three = new ListNode(3);
        two.next = three;
        ListNode four = new ListNode(4);
        three.next = four;
        ListNode five = new ListNode(5);
        four.next = five;
        ListNode six = new ListNode(6);
        five.next = six;
        six.next = head;

        LinkedListCycle linkedListCycle = new LinkedListCycle();
        System.out.println(linkedListCycle.hasCycle(head));
    }
    //Optimized solution
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
    public boolean hasCycleX(ListNode head) {
        if(head == null)
            return false;
        List<Integer> hasCodesList = new ArrayList<>();
        while (head.next != null){
            if(hasCodesList.contains(head.hashCode())){
                return true;
            }
            hasCodesList.add(head.hashCode());
            head = head.next;
        }
        return false;
    }

}
class ListNode{
    int val;
    ListNode next;
    ListNode(){}
    ListNode(int val){
        this.val = val;
    }
    ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }
}