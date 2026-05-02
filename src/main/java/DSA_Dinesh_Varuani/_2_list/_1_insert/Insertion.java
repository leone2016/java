package DSA_Dinesh_Varuani._2_list._1_insert;

import DSA_Dinesh_Varuani._2_list.ListNode;

public class Insertion {
    public static void main(String[] args) {
        ListNode sll = new ListNode();
        // Inicialización de la lista base (ejemplo del código original)
        sll.head = new ListNode(4);
        ListNode sec = new ListNode(5);
        ListNode trh = new ListNode(6);
        ListNode fourt = new ListNode(7);
        sll.head.setNext(sec);
        sec.setNext(trh);
        trh.setNext(fourt);
        System.out.println("Lista Inicial:");
        sll.display();
    }
}
