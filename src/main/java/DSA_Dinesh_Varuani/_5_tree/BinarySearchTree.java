package DSA_Dinesh_Varuani._5_tree;

/**
 * class 110
 * How to represent Binary Search Tree in Java?
 *
 * It is a type of Binary tree in wich data is organized in a ordered manner wich helps in fater search and insertion of data. It satisfies following properties:
 *  - The left subtree of a node contains only nodes with keys less than the node's key.
 *  - The right subtree of a node contains only nodes with keys greater than the node's key.
 *  - The left and right subtree each must also be a binary search tree.
 */
public class BinarySearchTree {
    private TreeNode root;
    private class TreeNode {
        private TreeNode left;
        private TreeNode right;
        private int data;

        public TreeNode(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(5);
        bst.insert(3);
        bst.insert(7);
        bst.insert(1);

        bst.inOrder();

        System.out.println("\n Search 3: " + (bst.search(3) == null ? "NOT found" : "Key found"));
        System.out.println("\n Search 23: " + (bst.search(23) == null ? "NOT found" : "Key found"))  ;
    }

    /**
     * class 113
     * Insert a node in Binary Search Tree
     *
     * @param value
     */
    public void insert(int value) {
        root = insert(root, value);
    }

    public TreeNode insert(TreeNode root, int value) {
        if (root == null) {
            root = new TreeNode(value);
            return root;
        }
        if (value < root.data) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }
        return root;
    }

    public void inOrder() {
        inOrder(root);
    }

    public void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
    /**
     * class 114
     * search a given key in a Binary Search Tree (Recursive)
     *
     * @param value
     */

    public TreeNode search(int value) {
        return search(root, value);
    }

    public TreeNode search(TreeNode root, int key) {
        if (root == null || root.data == key) {
            return root;
        }
        if (key < root.data) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    /**
     * class 115
     * Leetcode: Validate Binary Search Tree
     * Q. Given the root of a binary tree, determine if it is a valid binary search tree (BST).
     *
     * A binary tree is a BST if the following three conditions are satisfied:
     * - The left subtree of a node contains only nodes with keys less than the node's key.
     * - The right subtree of a node contains only nodes with keys greater than the node's key.
     * - Both the left and right subtrees must also be binary search trees.
     * 
     */
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, null, null);
    }
    public boolean isValidBST(TreeNode root, Integer min, Integer max) {
        if (root == null) {
            return true;
        }
        if ((min != null && root.data <= min) || (max != null && root.data >= max)) {
            return false;
        }
        return isValidBST(root.left, min, root.data) && isValidBST(root.right, root.data, max);
    }


}
