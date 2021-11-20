package com.anil.ds.ll;

public class RemoveLinkedListElement {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode two = new ListNode(2);
        head.next = two;
        ListNode three = new ListNode(6);
        two.next = three;
        ListNode four = new ListNode(3);
        three.next = four;
        ListNode five = new ListNode(4);
        four.next = five;
        ListNode six = new ListNode(5);
        five.next = six;
        ListNode seven = new ListNode(6);
        six.next = seven;

        RemoveLinkedListElement removeLinkedListElement = new RemoveLinkedListElement();
        removeLinkedListElement.removeElements(head, 7);

    }
    public ListNode removeElements(ListNode head, int val) {
        if(head == null)
            return head;
        ListNode newHead = new ListNode(0);
        ListNode tail = newHead;
        while (head!=null){
            if(head.val != val){
                tail.next = new ListNode(head.val);
            }
            head = head.next;
            if(tail.next != null)
                tail = tail.next;
        }
        return newHead.next;
    }
}
