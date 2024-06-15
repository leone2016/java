package leetCode;

import DSA_Dinesh_Varuani._2_list.SinglyLinkedList;

import java.util.List;

public class _2_add_two_numbers {
    private  ListNode head;
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }


    }

    public void insertLast(int value) {
        ListNode newNode = new ListNode(value);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode current = head;
        // Traverse to the last node
        while (null != current.next) {
            current = current.next;
        }
        current.next = newNode;
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode tail = result;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int x = l1!=null ? l1.val: 0;
            int y = l2!=null ? l2.val: 0;
            int sum = carry + (x + y);
            tail.next = new ListNode(sum % 10);
            tail = tail.next;
            carry = sum / 10;
            l1 =  l1!=null?  l1.next: null;
            l2 =  l2!=null?  l2.next: null;
        }
        if(carry > 0 ) tail.next = new ListNode(carry);

        return result.next;

    }
    public static void display(ListNode current) {

        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }


    public static  void main(String[] args) {
        _2_add_two_numbers l1 = new _2_add_two_numbers();
        l1.insertLast(2);
        l1.insertLast(4);
        l1.insertLast(3);

        _2_add_two_numbers l2 = new _2_add_two_numbers();
        l2.insertLast(5);
        l2.insertLast(6);
        l2.insertLast(4);

        display(l1.head);
        display(l2.head);
        display(addTwoNumbers(l1.head, l2.head));



    }
}
