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
        public void display() {
            ListNode current = next;
            while (current != null) {
                System.out.print(current.data + " | ");
                current = current.next;
            }
            System.out.println("null");
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

    /**
     * class 54, 55
     * Q. Implement method to delete a node at a given position.
     *
     * Assuming position to be valid and starting from 1
     */
    public ListNode deleteAtPosition(int position) {
        if (position == 1) {
            ListNode temp = head;
            head = head.next;
            temp.next = null;
            return temp;
        } else {
            ListNode previous = head;
            int count = 1;
            while (count < position - 1) {
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = current.next;
            current.next = null;
            return current;
        }
    }
    /**
     * class 56
     * Q. Implement method to search for a key in a linked list
     */
    public boolean find(int key) {
        ListNode current = head;
        while (current != null) {
            if (current.data == key) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    /**
     * class 57
     * Q. Implement method to reverse a linked list
     */
    public ListNode reverse() {
      if(head == null) {
          return head;
      }
        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    /**
     * class 58
     * Q. Implement method to find the middle node of a linked list
     */
    public ListNode findMiddle() {
         if(head == null) {
             return null;
         }
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        while (fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return slowPtr;
    }

    /**
     * class 59
     * Q. Implement method to find the nth node from the end of a linked list
     */
    public ListNode findNthFromEnd(int n) {
        if (head == null) {
            return null;
        }
        if (n <= 0) {
            throw new IllegalArgumentException("Invalid value: n = " + n);
        }
        ListNode mainPtr = head; // main pointer
        ListNode refPtr = head; // reference pointer
        int count = 0;
        while (count < n) {
            if (refPtr == null) {
                throw new IllegalArgumentException(n + " is greater than the number of nodes in the list");
            }
            refPtr = refPtr.next;
            count++;
        }
        while (refPtr != null) {
            refPtr = refPtr.next;
            mainPtr = mainPtr.next;
        }
        return mainPtr;
    }
    /**
     * class 60
     * Q. Remove duplicate from sorted linked list
     */
    public void removeDuplicates() {
        if (head == null) {
            return;
        }
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }

    /**
     * class 61
     * Q. Insert a node in a sorted linked list
     *
     * @return
     */
    public ListNode insertInSortedList(int value) {
        ListNode newNode = new ListNode(value);
        if (head == null) {
            return newNode;
        }
        ListNode current = head;
        ListNode temp = head;
        while (current != null && current.data < newNode.data) {
            temp = current;
            current = current.next;
        }
        newNode.next = current.next;
       temp.next = newNode;

        return head;
    }

    /**
     * class 62
     * Q. Implement method to delete a node with a given key
     */
    public ListNode deleteNode(int key) {
        ListNode current = head;
        ListNode previous = null;
        while (current != null && current.data != key) {
            previous = current;
            current = current.next;
        }
        if (current == null) {
            return head;
        }
        previous.next = current.next;
        return current;
    }

    /**
     * class 63, 64
     * Q. Implement method to delete a loop in a linked list
     */
    public boolean detectLoop() {
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        while (fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
            if (slowPtr == fastPtr) {
//                System.out.println("Loop found");
                return true;
            }
        }
//        System.out.println("Loop not found");
        return false;
    }

    /**
     * class 65, 66
     * Q. Implement method find stating point of a loop in a linked list
     */
    public ListNode findLoopStart() {
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        boolean loopExists = false;
        while (fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
            if (slowPtr == fastPtr) {
                loopExists = true;
                break;
            }
        }
        if (loopExists) {
            ListNode temp = head;
            while (temp != slowPtr) {
                temp = temp.next;
                slowPtr = slowPtr.next;
            }
            return temp;
        }
        return null;
    }

    /*
        class 67 Why Floyd's Cycle Detection algorithm works
     */

    /**
     * class 68
     * Q. remove loop in a linked list
     */
    public void removeLoop() {
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        boolean loopExists = false;
        while (fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
            if (slowPtr == fastPtr) {
                loopExists = true;
                break;
            }
        }
        if (loopExists) {
            ListNode temp = head;
            while (temp.next != slowPtr.next) { // to find the starting point of the loop
                temp = temp.next;
                slowPtr = slowPtr.next;
            }
            slowPtr.next = null;
        }
    }

    /**
     * class 70
     * Q. Given two sorted single linked list, merge them so that the resulting single linked list is also sorted
     *
     * @param a -> 1 -> 3 -> 5 -> 7 -> null
     *          b -> 2 -> 4 -> 6 -> 8 -> null
     * return 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8 -> null
     */
    public ListNode mergeTwoSortedLists(ListNode a, ListNode b) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while (a != null && b != null) {
            if (a.data < b.data) {
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }
        if (a != null) {
            tail.next = a;
        }
        if (b != null) {
            tail.next = b;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.head = new ListNode(4);
        ListNode sec = new ListNode(5);
        ListNode trh = new ListNode(6);
        ListNode fourt = new ListNode(7);
        // Now we will connect them together to form a chain
        sll.head.next = sec; // 10 --> 1
        sec.next = trh; // 10 --> 1 --> 8
        trh.next = fourt; // 10 --> 1 --> 8 --> 11 --> null

        sll.insertFirst(3);
        sll.insertFirst(2);
        sll.insertFirst(1);

        sll.insertLast(8);
        sll.insertLast(9);
        sll.insertLast(10);

//        sll.insertAtPosition(15, 4);
//        sll.insertAtPosition(16, 5);
//        sll.insertAtPosition(12, 5);
//        sll.insertAtPosition(16, 13);
        sll.display();
        System.out.println("Length of the linked list is: " + sll.length());

        ListNode test = sll.deleteFirst();
        System.out.println("\nDelete first: "+test.data);
        System.out.println("After deleting first node");
        sll.display();

        test = sll.deleteLast();
        System.out.println("\nDelete last: "+test.data);
        System.out.println("After deleting last node");
        sll.display();

        System.out.println("\nDelete a node fron a Single linked list at a given position".toUpperCase());
        test = sll.deleteAtPosition(1);
        System.out.println("Delete at position 1: "+test.data);
        test = sll.deleteAtPosition(3);
        System.out.println("Delete at position 3: "+test.data);
        sll.display();

        System.out.println("\nSearch an element in a single linked list in java".toUpperCase());
        System.out.println("Is 8 present in the list: "+sll.find(8));
        System.out.println("Is 20 present in the list: "+sll.find(20));

        System.out.println("\nReverse a single linked list in java".toUpperCase());
        sll.display();
        ListNode test2 = sll.reverse();
        sll.head = test2;
        sll.display();

        System.out.println("\nFind the middle node of a single linked list in java".toUpperCase());
        ListNode middle = sll.findMiddle();
        sll.display();
        System.out.println("Middle node is: "+middle.data);

        System.out.println("\nFind the nth node from the end of a single linked list in java".toUpperCase());
        sll.display();

        ListNode nthNode = sll.findNthFromEnd(3);
        System.out.println("3rd node from the end is: "+nthNode.data);

        System.out.println("\nRemove duplicates from a sorted linked list".toUpperCase());
        sll.insertAtPosition(5, 5);
        sll.insertAtPosition(9, 2);
        sll.insertAtPosition(3, 8);
        sll.display();
        sll.removeDuplicates();
        sll.display();

        System.out.println("\nReverse for test insertInSortedList".toUpperCase());
        sll.display();
        ListNode test3 = sll.reverse();
        sll.head = test3;
        sll.display();

        System.out.println("\nInsert a node in a sorted linked list".toUpperCase());
        sll.insertInSortedList(5);
        sll.insertInSortedList(2);
        sll.display();

        System.out.println("\nDelete a node with a given key".toUpperCase());
        sll.display();
        ListNode test4 = sll.deleteNode(5);
        System.out.println("After deleting node with key 5");
        sll.display();
        test4 = sll.deleteNode(8);
        System.out.println("After deleting node with key 8");
        sll.display();

        System.out.println("\nDetect a loop in a linked list".toUpperCase());
        sll.head = new ListNode(1);
       ListNode second = new ListNode(2);
         ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        ListNode sixth = new ListNode(6);
        sll.head = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = third;// LOOP
        //sll.display(); // infinite loop
        System.out.println("Contains infinitive loop? "+sll.detectLoop());

        System.out.println("\nDetect a stating point in loop in a linked list".toUpperCase());
        System.out.println("starting point: "+sll.findLoopStart().data);

        System.out.println("\nRemove a loop in a linked list".toUpperCase());
       sll.removeLoop();
        System.out.println("Contains infinitive loop? "+sll.detectLoop());
    }

}
