package DSA_Dinesh_Varuani.queue;

import DSA_Dinesh_Varuani.list.SinglyLinkedList.ListNode;
import udemy.U_lamdas.Main;

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

    public void enqueue(int data) {
        ListNode temp = new ListNode(data);
        if (isEmpty()) {
            front = temp;
        } else {
            rear.setNext(temp);
        }
        rear = temp;
        length++;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        ListNode current = front;
        while (current != null) {
            System.out.print(current.getData() + " --> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.print();

        queue.dequeue();
        queue.print();
        System.out.println("First element: " + queue.first());
        System.out.println("Last element: " + queue.last());
    }

    /*
     * class 96
     * Dequeue ELEMENTS  (remove)
     */
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int result = front.getData();
        front = front.getNext();
        if (front == null) {
            rear = null;
        }
        length--;
        return result;
    }

    /**
     * Peek the first element of the queue
     * @return
     */

    public int first() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return front.getData();
    }

    /**
     * Peek the last element of the queue
     * @return
     */
    public int last() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return rear.getData();
    }
}
