package DSA_Dinesh_Varuani._2_list;

public class ListNode {
    private int data;
    private ListNode next;

    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }

    // Métodos Getters y Setters
    public int getData() {
        return data;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    // Opcional: Para establecer la data si fuera necesario
    public void setData(int data) {
        this.data = data;
    }
}
