package MUI.FPP_COURSE.final_exam.recursion;

import java.util.LinkedList;

/**
 * Reverse Linked List: Given the head of a singly linked list, reverse the list, and return the
 * reversed list
 */
public class Exe2 {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }
    public static void main(String[] args) {

       ListNode head = new ListNode(1);
        ListNode n1 = new ListNode(2);
        ListNode n2 = new ListNode(3);
        ListNode n3 = new ListNode(4);
        ListNode n4 = new ListNode(5);
        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;




        ListNode reverse = reverseLL(head);

        System.out.println(reverse);
    }

    private static ListNode reverseLL(ListNode head) {

        if(head == null || head.next == null) return head;
        ListNode reversed = reverseLL(head.next);

        head.next.next = head;
        head.next = null;
        return reversed;
    }

}
