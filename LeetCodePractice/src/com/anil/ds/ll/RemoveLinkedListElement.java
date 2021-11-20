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
        removeLinkedListElement.removeElements(head, 6);

    }
    public ListNode removeElements(ListNode head, int val) {
        ListNode newHead = head;
        ListNode tempNode = newHead;
        while (head.next != null && head!=null){
            if(head.val != val){
                System.out.print(head.val + " -> ");
                head = head.next;
                tempNode = head.next;
            }
            else {
                head = head.next.next;
            }
            tempNode = tempNode.next;
        }
        return null;
    }
}
