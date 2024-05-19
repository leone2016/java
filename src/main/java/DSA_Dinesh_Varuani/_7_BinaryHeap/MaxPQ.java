package DSA_Dinesh_Varuani._7_BinaryHeap;

/*
class 123
 */
public class MaxPQ {

    Integer[] heap;
    int size;

    public MaxPQ(int capacity) {
        heap = new Integer[capacity + 1];// the first index is empty
        size = 0;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public int size() {
        return size;
    }

    public static void main(String[] args) {
        MaxPQ maxPQ = new MaxPQ(10);
        System.out.println(maxPQ.isEmpty());
        System.out.println(maxPQ.size());
    }
}
