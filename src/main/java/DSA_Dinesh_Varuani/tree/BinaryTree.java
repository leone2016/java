package DSA_Dinesh_Varuani.tree;


import javax.swing.tree.TreeNode;
import java.util.Stack;
import javax.swing.tree.TreeNode;
import java.util.Queue;
import java.util.LinkedList;

public class BinaryTree {
    private TreeNode root;

    private class TreeNode {
        private TreeNode left;
        private TreeNode right;
        private int data;

        public TreeNode(int data) {
            this.data = data;
        }
    }

    /**
     * class 99
     */
    public void createBinaryTree() {
        TreeNode first = new TreeNode(9);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);

        root = first; // root --> first
        first.left = second; // first --> second
        first.right = third; // first --> third
        second.left = fourth; // second --> fourth
        second.right = fifth; // second --> fifth
    }
    /**
     * class 100
     */
    public void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    /**
     * class 101
     * PreOrder Binary Tree Traversal
     * Visit the root node.
     * Traverse the left subtree in PreOrder fashion.
     * traverse the right subtree in PreOrder fashion.
     */
    public void preOrder() {
        if(root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            System.out.print(temp.data + " ");
            if(temp.right != null) {
                stack.push(temp.right);
            }
            if(temp.left != null) {
                stack.push(temp.left);
            }
        }
    }

    /**
     * Class 102
     * In order Binary tree traversal
     *
     * Traverse the left subtree in InOrder fashion.
     * Visit the root node.
     * Traverse the right subtree in InOrder fashion.
     */
    public void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
    /**
     * class 103
     * Iterative InOrder Binary Tree Traversal
     */
    private void inOrder() {
        if(root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;
        while(!stack.isEmpty() || temp != null) {
            if(temp != null) {
                stack.push(temp);
                temp = temp.left;
            } else {
                temp = stack.pop();
                System.out.print(temp.data + " ");
                temp = temp.right;
            }
        }
    }

    /**
     * class 104
     * Recursive Post order binary tree traversal
     *
     * traverse the left subtree in post order fashion
     * traverse the right subtree in post order fashion
     * visit the root node
     */
    public void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    /**
     * class 105
     * Iterative PostOrder Binary Tree Traversal
     *
     * reeinforce the concept of pre order traversal
     * https://www.youtube.com/watch?v=uigaktgcQWU&list=PL6Zs6LgrJj3tDXv8a_elC6eT_4R5gfX4d&index=105
     *
     */
    public void postOrder() {
        if(root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>(); // to store the nodes
        TreeNode current = root; // to traverse the tree
        while(current != null || !stack.isEmpty()) { // loop until current is null and stack is empty
            if(current != null) { // if current is not null
                stack.push(current); // push the current node to stack
                current = current.left; // move to the left of the current node
            } else {
                TreeNode temp = stack.peek().right; // get the right of the top node in stack
                if(temp == null) {
                    temp = stack.pop(); // if right is null, pop the top node from stack
                    System.out.print(temp.data + " "); // print the data of the top node
                    while(!stack.isEmpty() && temp == stack.peek().right) { // loop until stack is empty and right of top node is equal to temp
                        temp = stack.pop(); // pop the top node from stack
                        System.out.print(temp.data + " ");
                    }
                } else {
                    current = temp;
                }
            }
        }
    }

    /**
     * class 107
     * Level order traversal of a Binary Tree in Java
     */
    public void levelOrder() {
        if (root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            System.out.print(temp.data + " ");
            if (temp.left != null) {
                queue.offer(temp.left);
            }
            if (temp.right != null) {
                queue.offer(temp.right);
            }
        }
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.createBinaryTree();
        System.out.println("\n ITERATIVE PREORDER");
         bt.preOrder(bt.root);
        System.out.println("\n PREORDER");
        bt.preOrder();
        System.out.println("\n INORDER");
        bt.inOrder(bt.root);
        System.out.println("\n ITERATIVE INORDER");
        bt.inOrder();
        System.out.println("\n POSTORDER");
        bt.postOrder(bt.root);
        System.out.println("\n ITERATIVE POSTORDER");
        bt.postOrder();
        System.out.println("\n LEVEL ORDER");
        bt.levelOrder();
    }
}
