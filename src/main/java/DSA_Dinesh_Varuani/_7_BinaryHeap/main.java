package DSA_Dinesh_Varuani._7_BinaryHeap;
/*
Priority Queue

Priority Queue is a data  structure that allows us to find minimum/maximum element among a collection of elements in constant time. It supports following operations:
1. Insert: Insert an element in the priority queue.
2. ExtractMin/ExtractMax: Remove the minimum/maximum element from the priority queue.
3. GetMin/GetMax: Get the minimum/maximum element from the priority queue.
4. DecreaseKey/IncreaseKey: Decrease/Increase the value of a key in the priority queue.

Binary Heap
The binary heap is a data structure that help us in implementing the priority queue.
It is a complete binary tree that satisfies the heap property.
The heap property states that the key at the root must be minimum or maximum among
all keys present in the heap. The heap can be of two types:
1. Min Heap: In a min heap, the key at the root must be minimum among all keys present in the heap.
2. Max Heap: In a max heap, the key at the root must be maximum among all keys present in the heap.

Complete Binary tree
A complete binary tree is a binary tree in which all levels are completely filled except possibly the last level
 and the last level has all keys as left as possible.

 */
public class main {
    public static void main(String[] args) {

    }

    /**
     * class 121
     * https://youtu.be/nC8SYpmA2Ms?list=PL6Zs6LgrJj3tDXv8a_elC6eT_4R5gfX4d&t=652
     * Representation of a binary heap
     * - Binary heap can be represented using an array.
     * - The fisrt entry of array is taken as empty.
     * - As Binary heaps are complete binary trees, the elements can be stored in the array by traversing tree level by level from left to right.
     * - For any node at index i, the left child will be at index 2*i+1 and the right child will be at index 2*i+2.
     * - The parent of the node at index i will be at index (i-1)/2.
     * - The heap can be of two types: Min Heap and Max Heap.
     * - In a Min Heap, the key at the root must be minimum among all keys present in the heap.
     * - In a Max Heap, the key at the root must be maximum among all keys present in the heap.
     *
     * Children of 1st index = 2 , 3
     * Children of 2nd index = 4 , 5
     * Children of 3rd index = 6 , 7
     * Children of Kth index = 2K, 2K+1
     *
     * Parent of 7th index = 3 => (7)/2 = 3.5 => 3
     * Parent of 6th index = 2 => (6)/2 = 3 => 3
     * Parent of 5th index = 2 => (5)/2 = 2.5 => 2
     * Parent of Kth index = K/2
     */
}
