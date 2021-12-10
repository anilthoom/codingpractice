package com.anil.ds.ll;

//https://leetcode.com/problems/add-two-numbers/
public class AddTwoNums {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode two = new ListNode(2);
        l1.next = two;
        ListNode three = new ListNode(4);
        two.next = three;

        ListNode l2 = new ListNode(1);
        ListNode l2i = new ListNode(3);
        l2.next = l2i;
        ListNode l2j = new ListNode(4);
        l2i.next = l2j;
        AddTwoNums addTwoNums = new AddTwoNums();
        addTwoNums.addTwoNumbers(l1, l2);
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int totalSum = 0;
        while (l1 != null){
            totalSum += l1.val;
            l1 = l1.next;
        }
        while (l2 != null){
            totalSum += l2.val;
            l2 = l2.next;
        }
        System.out.println(totalSum);
        ListNode mergedNode = new ListNode();
        return mergedNode;
    }
}
