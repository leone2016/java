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

    public void insertLast(int value) {
        ListNode newNode = new ListNode(value);
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        newNode.previous = tail;
        tail = newNode;
        length++;
    }

}
