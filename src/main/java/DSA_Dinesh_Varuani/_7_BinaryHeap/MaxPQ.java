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

    /**
     * class 124
     * Button up reHeapify mas heap
     * - A Maxx heap is a complete tree in which each node value is >= than the values of its children.
     * - After inserting an element into heap. It may not satisfy above heap property. Thus, we perform button-up
     *   reheapify technique, in which we adjust the locations of elements to satisfy heap property
     */
    public void insert(int x) {
        if (size == heap.length - 1) {
//            throw new IllegalArgumentException("Heap is full");/
            resize(2 * heap.length);
        }
        size++;
        heap[size] = x;
        swim(size);
    }
    private void swim(int k) {
        while (k > 1 && heap[k / 2] < heap[k]) {
            int temp = heap[k];
            heap[k] = heap[k / 2];
            heap[k / 2] = temp;
            k = k / 2;// because we have to check for the parent of the parent
        }
    }
    private void resize(int capacity) {
        Integer[] temp = new Integer[capacity];
        for (int i = 1; i <= size; i++) {
            temp[i] = heap[i];
        }
        heap = temp;
    }

    public void printMaxHeap() {
        for (int i = 1; i <= size; i++) {
            System.out.print(heap[i] + " | ");
        }
    }


    public static void main(String[] args) {
        MaxPQ maxPQ = new MaxPQ(3);
        System.out.println(maxPQ.isEmpty());
        System.out.println(maxPQ.size());

        System.out.println("\n Testing insert");
        maxPQ.insert(10);
        maxPQ.insert(20);
        maxPQ.insert(30);
        maxPQ.insert(40);
        System.out.println("Size heap: "+maxPQ.size());
        maxPQ.printMaxHeap();
    }
}
