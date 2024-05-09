package DSA_Dinesh_Varuani.list;

/**
 * Doubly linked list
 * <p>
 * - it is called two way linked list.
 * - Give a node, we can navigate list in both froward and backward direction, which is not possible in Singly linked list.
 * - A node in Single linked list can only be deleted if we have a poointer to its previous node. But in Double linked list, we can delete a node even if we don't have a pointer to its previous node.
 * - ListNode in Double linked list has three fields: data, next and previous
 */
public class DoublyLinkedList {
    /*
     * class 74
     */
    private ListNode head;
    private ListNode tail;
    private int length;

    private class ListNode {
        private int data;
        private ListNode next;
        private ListNode previous;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean isEmpty() {
        return length == 0; // head == null
    }

    public int length() {
        return length;
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertLast(1);
        dll.insertLast(10);
        dll.insertLast(15);
        dll.insertLast(20);
        dll.insertLast(25);
        dll.insertLast(30);
        dll.displayForward();
        dll.displayBackward();
        System.out.println("\nInsert node at the beginning of a doubly linked list".toUpperCase());
        dll.insertFirst(11);
        dll.displayForward();

        System.out.println("\nInsert node at the end of a doubly linked list".toUpperCase());
        dll.insertLast(31);
        dll.displayForward();

        System.out.println("\nDelete first node from doubly linked list".toUpperCase());
        dll.deleteFirst();
        dll.displayForward();

        System.out.println("\nDelete last node from doubly linked list".toUpperCase());
        dll.deleteLast();
        dll.displayForward();


    }

    /**
     * class 78
     * Q. How to delete the fist node from doubly linked list?
     */
    public ListNode deleteFirst() {
        if (isEmpty()) {
            throw new RuntimeException("List is empty");
        }
        ListNode temp = head;
        if (head == tail) {
            tail = null;
        } else {
            head.next.previous = null;
        }
        head = head.next;
        temp.next = null;
        length--;
        return temp;
    }

    /**
     * class 79
     * Q. How to delete the last node from doubly linked list?
     */
    public ListNode deleteLast() {
        if (isEmpty()) {
            throw new RuntimeException("List is empty");
        }
        ListNode temp = tail;
        if (head == tail) {
            head = null;
        } else {
            tail.previous.next = null;
        }
        tail = tail.previous;
        temp.previous = null;
        length--;
        return temp;
    }
    /**
     * class 77
     */
    public void insertLast(int value) {
        ListNode newNode = new ListNode(value);
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
        }
        tail = newNode;
        length++;
    }

    /**
     * class 76
     */
    public void insertFirst(int value) {
        ListNode newNode = new ListNode(value);
        if (isEmpty()) {
            tail = newNode;
        } else {
            head.previous = newNode;
        }
        newNode.next = head;
        head = newNode;
        length++;
    }

    /*
     * class 75
     */
    public void displayForward() {
        System.out.println("Displaying the list (head --> tail)");
        if (head == null) {
            return;
        }
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void displayBackward() {
        System.out.println("Displaying the list (tail --> head)");
        if (tail == null) {
            return;
        }
        ListNode temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.previous;
        }
        System.out.println("null");
    }



}
