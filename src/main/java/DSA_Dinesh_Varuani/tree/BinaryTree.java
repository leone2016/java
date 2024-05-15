package DSA_Dinesh_Varuani.tree;


import javax.swing.tree.TreeNode;
import java.util.Stack;
import javax.swing.tree.TreeNode;

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
    }
}
