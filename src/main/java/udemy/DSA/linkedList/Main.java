package udemy.DSA.linkedList;

public class Main {

    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        list.createSingleLinkedList(5);
        System.out.printf("Head: %d\n", list.head.value);
        list.insertInLinkedList(6, 0);
        list.insertInLinkedList(2, 1);
        list.insertInLinkedList(3, 2);
        System.out.printf("Head: %d\n", list.head.value);

    }
}
