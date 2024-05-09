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
        System.out.print(first.data);
    }

    public static void main(String[] args) {
        CircularSinglyLinkedLIst cll = new CircularSinglyLinkedLIst();
        cll.createCircularLinkedList();
        cll.display();
    }
}
