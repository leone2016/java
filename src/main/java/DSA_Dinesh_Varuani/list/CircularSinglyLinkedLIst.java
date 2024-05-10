package DSA_Dinesh_Varuani.list;

/**
 * What is a Circular Singly Linked List?
 * <p>It similar to singly linked list, except that the last node points to the first node in the list.</p>
 * <p>Instead of head, we keep track of last node in circular singly list</p>
 * <p>Advantages:</p>
 * <p>1. Any node can be a starting point.</p>
 * <p>2. Useful for implementing round robin algorithm.</p>
 * <p>3. Useful for implementing a stack.</p>
 * <p>4. Useful for implementing a queue.</p>
 * <p>5. Useful for implementing a hash table.</p>
 * <p>6. Useful for implementing a graph.</p>
 * <p>7. Useful for implementing a Fibonacci heap.</p>
 * <p>8. Useful for implementing a skip list.</p>
 * <p>9. Useful for implementing a circular buffer.</p>
 * <p>10. Useful for implementing a circular queue.</p>
 * <p>11. Useful for implementing a circular list.</p>
 * <p>12. Useful for implementing a circular stack.</p>
 * <p>13. Useful for implementing a circular linked list.</p>
 * <p>14. Useful for implementing a circular doubly linked list.</p>
 * <p>15. Useful for implementing a circular doubly linked list with a head node.</p>
 * <p>16. Useful for implementing a circular doubly linked list with a tail node.</p>
 * <p>17. Useful for implementing a circular doubly linked list with a head and tail node.</p>
 * <p>18. Useful for implementing a circular doubly linked list with a dummy node.</p>
 *
 */
public class CircularSinglyLinkedLIst {
    private ListNode last;
    private int length;

    private class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
        }
    }
    //Constructor
    public CircularSinglyLinkedLIst() {
        last = null;
        length = 0;
    }

    public static void main(String[] args) {
        CircularSinglyLinkedLIst cll = new CircularSinglyLinkedLIst();
        System.out.println("Circular Singly Linked List");
        cll.createCircularLinkedList();
        cll.display();
        System.out.println("\nInsert a new node at the beginning of the circular linked list, inserting 0 at first");
        cll.insertFirst(0);
        System.out.println("\nLength of Circular Singly Linked List: " + cll.length());
        cll.display();

        System.out.println("\nInsert a new node at the end of the circular linked list, inserting 20 at last");
        cll.insertLast(20);
        cll.insertLast(21);
        cll.insertLast(22);

        cll.display();

        System.out.println("\nRemove a first node from the circular linked list");
        cll.removeFirst();
        cll.display();
    }
    /**
     * class 85
     * remove a fist node from a circular linked list
     */
    public ListNode removeFirst() {
        if (isEmpty()) {
            return null;
        }
        ListNode temp = last.next;
        if (last.next == last) {
            last = null;
        } else {
            last.next = temp.next;
        }
        temp.next = null;
        length--;
        return temp;
    }

    /**
     * class 84
     * Insert a new node at the end of the circular linked list
     */
    public void insertLast(int data) {
        ListNode temp = new ListNode(data);
        if (last == null) {
            last = temp;
            last.next = last;
        } else {
            temp.next = last.next;
            last.next = temp;
            last = temp;
        }
        length++;
    }

    /**
     * class 83
     * Insert a new node at the beginning of the circular linked list
     */
    public void insertFirst(int data) {
        ListNode temp = new ListNode(data);
        if (last == null) {
            last = temp;
        } else {
            temp.next = last.next;
        }
        last.next = temp;
        length++;
    }
   /*
    class 82
    * Display the circular linked list
     */

    public void display() {
        if (last == null) {
            return;
        }
        ListNode first = last.next;
        while (first != last) {
            System.out.print(first.data + " --> ");
            first = first.next;
        }
        System.out.print(first.data);//print last node
    }

    public int length() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void createCircularLinkedList() {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(5);
        ListNode third = new ListNode(10);
        ListNode fourth = new ListNode(15);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = first;

        last = fourth;
    }

}
