package com.anil.twopointers;

//https://leetcode.com/problems/middle-of-the-linked-list/
public class MiddleOfLinkedList {
    public static void main(String[] args) {
        MiddleOfLinkedList middleOfLinkedList = new MiddleOfLinkedList();
    }
    public ListNode middleNode(ListNode head) {
        return head;
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
