package DSA_Dinesh_Varuani.list;

public class SinglyLinkedList {

    /**
     * class 36, 37, 38, 39, 40, 41, 42, 43
     * String Linked list
     *
     * Singly linked list is a data structure used for storing collection of nodes and has the following properties:
     *
     *  - It contains a sequences of nodes
     *  - A node has data and a reference to the next node in a list
     *  - First node is head node.
     *  - Last node has data and points to null
     */
    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " | ");
            current = current.next;
        }
        System.out.println("null");
    }

    public int length() {
        if (head == null) {
            return 0;
        }
        int count = 0;
        ListNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    /**
     * class 44, 45
     * Insert a new node at the beginning of the linked list
     * @param value
     */
    public void insertFirst(int value) {
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    /**
     * class 46, 47
     * Insert a new node at the end of the linked list
     * @param value
     */
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

    /**
     * class 48, 49
     * Q. implement method to insert a node at a given position. Assuming position to be valid and starting from 1
     */
    private void insertAtPosition( int value,int position) {
        ListNode newNode = new ListNode(value);
        if (position == 1) {
            newNode.next = head;
            head = newNode;
        } else {
            ListNode previous = head;
            int count = 1;
            while (count < position - 1) {
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            newNode.next = current;
            previous.next = newNode;
        }
    }

    /**
     * class 50, 51
     * @return
     */
    public ListNode deleteFirst() {
        if (head == null) {
            return null;
        }
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    /**
     * class 52, 53
     * @return
     */
    public ListNode deleteLast() {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        while (current.next != null) {
            previous = current;
            current = current.next;
        }
        previous.next = null;
        return current;
    }

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);
        // Now we will connect them together to form a chain
        sll.head.next = second; // 10 --> 1
        second.next = third; // 10 --> 1 --> 8
        third.next = fourth; // 10 --> 1 --> 8 --> 11 --> null

        sll.insertFirst(0);
        sll.insertFirst(2);
        sll.insertFirst(3);

        sll.insertLast(12);
        sll.insertLast(13);
        sll.insertLast(14);

        sll.insertAtPosition(15, 4);
        sll.insertAtPosition(16, 5);
        sll.insertAtPosition(12, 5);
        sll.insertAtPosition(16, 13);
        sll.display();
        System.out.println("Length of the linked list is: " + sll.length());

        ListNode test = sll.deleteFirst();
        System.out.println("Delete first: "+test.data);
        System.out.println("After deleting first node");
        sll.display();

        test = sll.deleteLast();
        System.out.println("Delete last: "+test.data);
        System.out.println("After deleting last node");
        sll.display();

    }

}
