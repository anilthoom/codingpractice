package com.anil.ds.ll;

//https://leetcode.com/problems/add-two-numbers/
public class AddTwoNums {
    public static void main(String[] args) {
        //[2,4,9]
        //[5,6,4,9]
        ListNode l1 = new ListNode(2);
        ListNode two = new ListNode(4);
        l1.next = two;
        ListNode three = new ListNode(3);
        two.next = three;

        ListNode l2 = new ListNode(5);
        ListNode l2i = new ListNode(6);
        l2.next = l2i;
        ListNode l2j = new ListNode(4);
        l2i.next = l2j;
        AddTwoNums addTwoNums = new AddTwoNums();
        addTwoNums.addTwoNumbers(l1, l2);
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuffer l1Str = new StringBuffer();
        while (l1 != null){
            l1Str.append(l1.val);
            l1 = l1.next;
        }
        l1Str.reverse();
        StringBuffer l2Str = new StringBuffer();
        while (l2 != null){
            l2Str.append(l2.val);
            l2 = l2.next;
        }
        l2Str.reverse();
        int total = Integer.parseInt(l1Str.toString())+Integer.parseInt(l2Str.toString());
        System.out.println(total);
        StringBuffer stringBuffer = new StringBuffer(total+"");
        stringBuffer.reverse();
        System.out.println(stringBuffer);
        ListNode mergedNode = new ListNode(0);
        ListNode tail = mergedNode;
        for(int i=0; i<stringBuffer.length(); i++){
            int val = Integer.parseInt(""+stringBuffer.charAt(i));
            ListNode newNode = new ListNode(val);
            tail.next = newNode;
            tail = newNode;
        }
        return mergedNode.next;
    }
}
