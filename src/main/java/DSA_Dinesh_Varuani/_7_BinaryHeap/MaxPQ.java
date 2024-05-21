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
     * class 125-126
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

    /**
     * class 127
     * https://youtu.be/w-rZONjVI0c?list=PL6Zs6LgrJj3tDXv8a_elC6eT_4R5gfX4d
     * Complete Binary tree: A complete binary tree is a binary tree in which all levels are completely filled except possibly the last level and the last level has all keys as left as possible.
     * Incomplete Binary tree: A binary tree in which all levels are not completely filled is called an incomplete binary tree.
     *
     * Top-down reheapify max heap
     * - After deleting an element from heap. It may not satisfy above heap property. Thus, we perform top-down reheapify technique, in which we adjust the locations of elements to satisfy heap property.
     * - In top-down reheapify, we compare the parent with its children and swap the parent with the larger child if the parent is smaller than the child.
     * - We continue this process until the parent is greater than both its children.
     * - The process is repeated until the heap property is satisfied.
     */
    /**
     * class 128
     * Delete max element from max heap
     */
    public int deleteMax() {
        int max = heap[1];
        swap(1, size);
        size--;
        sink(1);
        heap[size + 1] = null;
        if(size > 0 && size == (heap.length - 1) / 4) {
            resize(heap.length / 2);
        }
        return max;
    }
    private void sink(int k) {
        while (2 * k <= size) {
            int j = 2 * k;
            if (j < size && heap[j] < heap[j + 1]) {
                j++;
            }
            if (heap[k] >= heap[j]) {
                break;
            }
            swap(k, j);
            k = j;
        }
    }
    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }


    public static void main(String[] args) {
        MaxPQ maxPQ = new MaxPQ(3);
        System.out.println(maxPQ.isEmpty());
        System.out.println(maxPQ.size());

        System.out.println("\n Testing insert");
        maxPQ.insert(4);
        maxPQ.insert(3);
        maxPQ.insert(6);
        maxPQ.insert(2);
        maxPQ.insert(1);
        maxPQ.insert(5);
        maxPQ.insert(9);
        System.out.println("Size heap: "+maxPQ.size());
        maxPQ.printMaxHeap();
        maxPQ.deleteMax();
        System.out.println("\nSize heap: "+maxPQ.size());
        maxPQ.printMaxHeap();
    }
}
