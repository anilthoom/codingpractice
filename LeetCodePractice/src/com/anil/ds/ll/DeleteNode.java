package com.anil.ds.ll;

public class DeleteNode {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode two = new ListNode(2);
        head.next = two;
        ListNode three = new ListNode(3);
        two.next = three;
        ListNode four = new ListNode(4);
        three.next = four;
        DeleteNode deleteNode = new DeleteNode();
        deleteNode.deleteNode(two);
        System.out.println();
    }
    public void deleteNode(ListNode node) {
        if(node.next.next != null){
            node.val  = node.next.val;
            node.next = node.next.next;
        }
        else {
            node.val  = node.next.val;
            node.next = null;
        }
    }
}
