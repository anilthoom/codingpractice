package com.anil.ds.ll;

import java.util.ArrayList;
import java.util.Arrays;
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
        ListNode sortedList = mergeTwoSortedLists.mergeTwoLists(l1, l2);
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode mergedList = new ListNode(0);
        ListNode tail = mergedList;
        while (true){
            if(l1 == null){
                tail.next = l2;
                break;
            }
            if(l2 == null){
                tail.next = l1;
                break;
            }
            if(l1.val <= l2.val){
                tail.next = l1;
                l1 = l1.next;
            }
            else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }
        return mergedList.next;
    }
}
