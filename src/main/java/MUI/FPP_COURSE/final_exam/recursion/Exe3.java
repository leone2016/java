package MUI.FPP_COURSE.final_exam.recursion;

/**
 * Merge Two Sorted Lists: You are given the heads of two sorted linked lists list1 and list2.
 * Merge the two lists in a one sorted list. Return the head of the merged linked list.
 */
public class Exe3 {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }
    // Recursive method to merge two sorted linked lists
    public static ListNode mergeTwoListsRecursive(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        if (list1.val < list2.val) {
            list1.next = mergeTwoListsRecursive(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoListsRecursive(list1, list2.next);
            return list2;
        }
    }

    // Utility method to print the list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Helper to create a list from an array
    public static ListNode createList(int[] values) {
        if (values.length == 0) return null;
        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }
        return head;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};

        ListNode list1 = createList(arr1);
        ListNode list2 = createList(arr2);

        System.out.print("List 1: ");
        printList(list1);
        System.out.print("List 2: ");
        printList(list2);

        ListNode merged = mergeTwoListsRecursive(list1, list2);
        System.out.print("Merged: ");
        printList(merged);
    }
}
