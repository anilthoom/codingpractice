package com.anil.ds.ll;

//https://leetcode.com/problems/add-two-numbers/
public class AddTwoNums {
    public static void main(String[] args) {
        //[2,4,9]
        //[5,6,4,9]
        ListNode l1 = new ListNode(1);
        ListNode two = new ListNode(2);
        l1.next = two;
        ListNode three = new ListNode(5);
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
        String l1Str = "";
        while (l1 != null){
            l1Str += l1.val;
            l1 = l1.next;
        }
        String l2Str = "";
        while (l2 != null){
            l2Str += l2.val;
            l2 = l2.next;
        }
        int total = Integer.parseInt(l1Str)+Integer.parseInt(l2Str);
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
