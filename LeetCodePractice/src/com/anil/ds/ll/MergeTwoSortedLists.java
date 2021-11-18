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
        ListNode sortedList = mergeTwoSortedLists.mergeTwoLists(l1, l2);
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode remainingL1 =l1, remainingL2 = l2;
        while (remainingL1.next !=null && remainingL2.next!=null){
            int v1 = remainingL1.val;
            int v2 = remainingL2.val;
            if(v1<v2){
                // Attach l2 to l1
                remainingL2 = remainingL2.next;
                l2.next =null;
                remainingL1 = remainingL1.next;
                l1.next = l2;
            }
            else if(v2<v1){
                //Attach l1 to l2
            }
        }
        return null;
    }
}
