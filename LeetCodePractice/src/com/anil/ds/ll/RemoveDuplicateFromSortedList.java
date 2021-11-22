package com.anil.ds.ll;
//https://leetcode.com/problems/remove-duplicates-from-sorted-list/
public class RemoveDuplicateFromSortedList {
    public static void main(String[] args) {
        RemoveDuplicateFromSortedList removeDuplicateFromSortedList = new RemoveDuplicateFromSortedList();
        ListNode head = new ListNode(1);
        ListNode two = new ListNode(1);
        head.next = two;
        ListNode three = new ListNode(1);
        two.next = three;
//        ListNode four = new ListNode(3);
//        three.next = four;
//        ListNode five = new ListNode(5);
//        four.next = five;
//        ListNode six = new ListNode(6);
//        five.next = six;
//        ListNode seven = new ListNode(6);
//        six.next = seven;
        removeDuplicateFromSortedList.deleteDuplicates(head);
    }
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null)
            return null;
        ListNode dummyNode = new ListNode();
        dummyNode.next = head;
        ListNode current = dummyNode.next;
        while (current.next != null){
            if(current.val == current.next.val){
                current.next = current.next.next;
            }
            else {
                current = current.next;
            }
        }
        return dummyNode.next;
    }
}
