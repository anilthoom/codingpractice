package com.anil.ds.ll;

public class ReverseLinkedList {
    public static void main(String[] args) {
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
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
        ListNode seven = new ListNode(7);
        six.next = seven;
        reverseLinkedList.reverseList(head);
    }
    public ListNode reverseList(ListNode head) {
        return null;
    }
}
