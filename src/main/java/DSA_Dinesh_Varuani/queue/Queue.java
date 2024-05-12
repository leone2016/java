package DSA_Dinesh_Varuani.queue;

import DSA_Dinesh_Varuani.list.SinglyLinkedList.ListNode;

public class Queue {
    private ListNode front;
    private ListNode rear;
    private int length;

    public Queue() {
        this.front = null;
        this.rear = null;
        this.length = 0;
    }

    public int length() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

}
