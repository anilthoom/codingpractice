package com.anil.ds.ll;

public class RemoveDuplicateFromSortedList {
    public static void main(String[] args) {
        RemoveDuplicateFromSortedList removeDuplicateFromSortedList = new RemoveDuplicateFromSortedList();
        ListNode head = new ListNode(1);
        ListNode two = new ListNode(1);
        head.next = two;
        ListNode three = new ListNode(3);
        two.next = three;
        ListNode four = new ListNode(3);
        three.next = four;
        ListNode five = new ListNode(5);
        four.next = five;
        ListNode six = new ListNode(6);
        five.next = six;
        ListNode seven = new ListNode(6);
        six.next = seven;
        removeDuplicateFromSortedList.deleteDuplicates(head);
    }
    public ListNode deleteDuplicates(ListNode head) {
        return head;
    }
}
