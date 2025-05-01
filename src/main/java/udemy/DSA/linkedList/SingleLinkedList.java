package udemy.DSA.linkedList;

public class SingleLinkedList {
    public Node head;
    public Node tail;
    public int size;

    /**
     * Create a single linked list,
     * O(1) time complexity
     * O(1) space complexity
     * @param nodeValue
     * @return
     */
    public Node createSingleLinkedList(int nodeValue) {
        head = new Node();
        Node node = new Node();
        node.value = nodeValue;
        node.next = null;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    /**
     * Insert a node in a single linked list,
     * O(n) time complexity
     * O(1) space complexity
     * @param nodeValue
     */
    public void insertInLinkedList(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;
        if (head == null) {
            createSingleLinkedList(nodeValue);
            return;
        } else if (location == 0) {// insert at start
            node.next = head;
            head = node;
        } else if (location >= size) { // insert at end
            node.next = null;
            tail.next = node;
            tail = node;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }
        size++;
    }
}

/**
 * Prueba de escritorio
 *
 Node tempNode = head; // 6 -> 5
 index = 0;
 while (index< location-1){ // 0 < 1-1
 FALSE
 }
 Node nextNode = tempNode.next;// 5
 tempNode.next = node; // 6 -> 2
 node.next = nextNode; // 2 -> 5

 WHY I don't reassign tempNode to head?




 */