package DSA_Dinesh_Varuani._3_stacks;

import DSA_Dinesh_Varuani._2_list.SinglyLinkedList.ListNode;

/**
 * Representation
 * What is a Stack
 * It is a linear data structure used for storing the data
 * it is a ordered list in wich insertion a deletion are done at one end called the top
 * The las element inserted is the first one to be deleted, hence it is called the Last In First Out (LIFO) data structure
 */

public class Stack {
    private ListNode top;
    private int length;

    public Stack() {
        top = null;
        length = 0;
    }

    public int length() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    /**
     * Push operation
     * insert an element at the top of the stack
     * @param data
     */
    public void push(int data) {
        ListNode temp = new ListNode(data);
        temp.setNext(top);
        top = temp;
        length++;
    }
    /**
     * Pop operation
     * remove the top element
     * @return
     */
    public int pop() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
            throw new IllegalStateException("Stack is empty");
        }
        int result = top.getData();
        top = top.getNext();
        length--;
        return result;
    }

    /**
     * Peek operation
     * get the top element
     * @return
     */
    public int peek() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
            throw new IllegalStateException("Stack is empty");
        }
        return top.getData();
    }
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Length of stack: " + stack.length());
        System.out.println("Top element: " + stack.peek());
        System.out.println("Pop element: " + stack.pop());
        System.out.println("Top element: " + stack.peek());
        System.out.println("Length of stack: " + stack.length());

    }
}
