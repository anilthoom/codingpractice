package com.anil.twopointers;

public class MiddleOfLinkedList {
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
        ListNode six = new ListNode(5);
        five.next = six;

        MiddleOfLinkedList middleOfLinkedList = new MiddleOfLinkedList();
        middleOfLinkedList.middleNode(head);
    }
    //https://leetcode.com/problems/remove-nth-node-from-end-of-list/
    public ListNode removeNthFromEnd(ListNode head, int n) {
        return head;
    }

    //https://leetcode.com/problems/middle-of-the-linked-list/
    public ListNode middleNode(ListNode head) {
        int listSize = 1;
        ListNode tempHead = head;
        while (tempHead.next != null){
            tempHead = tempHead.next;
            listSize++;
        }
        int midOfList = listSize/2;
        int counter = -1;
        System.out.println(listSize);
        while (head.next != null){
            counter++;
            if(counter == midOfList){
                return head;
            }
            head = head.next;
        }
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
