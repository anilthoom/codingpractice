package com.anil.ds.ll;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/93/linked-list/772/
public class PalindromeLinkedList {
    public static void main(String[] args) {
        PalindromeLinkedList palindromeLinkedList = new PalindromeLinkedList();
        ListNode head = new ListNode(1);
        ListNode two = new ListNode(2);
        head.next = two;
        ListNode three = new ListNode(2);
        two.next = three;
        ListNode one = new ListNode(1);
        three.next = one;
        System.out.println(palindromeLinkedList.isPalindrome(head));
    }
    public boolean isPalindrome(ListNode head) {
        StringBuffer stringBuffer = new StringBuffer();
        while (head!=null){
            stringBuffer.append(head.val);
            head = head.next;
        }
        String original = stringBuffer.toString();
        return original.contentEquals(stringBuffer.reverse());
    }
}
