package MUI.FPP_COURSE.final_exam.polymorphism.exe2;

import java.util.RandomAccess;

/**
 * @author: Leonardo Medina
 * @param <T>
 */
public class MyLinkedLIst<T> extends AbstractMyList<T>{

    private Node head = null;
    private Node tail = null;

    public class Node{
        T value;
        Node next;
        Node(T val) {this.value = val;}
    }



    @Override
    public void add(T item){
        Node newNode = new Node(item);
        if(head == null) head = tail = newNode;
        else{
            tail.next = newNode;
            tail = newNode;
        }
        count++;
    }

    @Override
    public T get(int index){
        if(index < 0 || index >= count )throw new IndexOutOfBoundsException();

        Node current = head;
        for( int i=0; i< index; i++) current = current.next;
        return current.value;
    }
}
