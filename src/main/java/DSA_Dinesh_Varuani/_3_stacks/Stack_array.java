package DSA_Dinesh_Varuani._3_stacks;

public class Stack_array {
    private int[] arr;
    private int top;
    private int capacity;

    public Stack_array(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.top = -1;
    }

    public int size() {
        return top + 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }
    public boolean isFull() {
        return top == capacity - 1;
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack is full");
            throw new IllegalStateException("Stack is full");
        }
        arr[++top] = data;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            throw new IllegalStateException("Stack is empty");
        }
        return arr[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            throw new IllegalStateException("Stack is empty");
        }
        return arr[top];
    }

    public static void main(String[] args) {
        Stack_array stack = new Stack_array(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("Stack size: " + stack.size());
        System.out.println("Stack peek: " + stack.peek());
        System.out.println("Stack pop: " + stack.pop());
        System.out.println("Stack peek: " + stack.peek());
        System.out.println("Stack pop: " + stack.pop());
        System.out.println("Stack peek: " + stack.peek());
        System.out.println("Stack size: " + stack.size());
    }


}
