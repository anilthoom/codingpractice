package com.anil.ds.ll;

import java.util.List;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();
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
        mergeTwoSortedLists.mergeTwoLists(l1, l2);
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        return null;
    }
}
