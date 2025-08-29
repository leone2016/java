package DSA_Dinesh_Varuani._11_BinaryTree;

import java.util.Stack;

public class TreeNode<T> {
    private T data;
    private TreeNode<T> left;
    private TreeNode<T> right;

    public TreeNode(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public TreeNode<T> getLeft() {
        return left;
    }

    public void setLeft(TreeNode<T> left) {
        this.left = left;
    }

    public TreeNode<T> getRight() {
        return right;
    }

    public void setRight(TreeNode<T> right) {
        this.right = right;
    }

    /**
     * Traverse the node first
     * Visit the left subtree
     * Visit the right subtree
     * * Pre-order traversal is used to create a copy of the tree
     * @param root
     * @param <T>
     */

    public static<T extends  Object> void preOrderRecursion(TreeNode<T> root) {
        if (root == null) return;

        System.out.printf(" %d |", root.data);
        preOrderRecursion(root.left);
        preOrderRecursion(root.right);
    }

    public static<T extends  Object> void preOrderIterative(TreeNode<T> root) {
        if (root == null) return;
        Stack<TreeNode<T>> stack = new Stack<TreeNode<T>>();
        stack.push(root);
        while (!stack.empty()) {
            TreeNode<T> temp = stack.pop();
            System.out.printf(" %d |", temp.data);
            if (temp.right != null) {
                stack.push(temp.right);
            }
            if (temp.left != null) {
                stack.push(temp.left);
            }
        }
    }

    /**
    * Traverse the left subtree in order fashion
     * Visit the root node
     * Traverse the right subtree in order fashion
     **/
    public static<T extends Object> void inOrderRecursion(TreeNode<T> root) {
        if (root == null) return;
        inOrderRecursion(root.left);
        System.out.printf(" %d |", root.data);
        inOrderRecursion(root.right);
    }

    public static<T extends Object> void inOrderIterative(TreeNode<T> root) {
        if (root == null) return;
        Stack<TreeNode<T>> stack = new Stack<TreeNode<T>>();
        TreeNode<T> current = root;

        while (current != null || !stack.isEmpty()) {
         if(current != null) {
                stack.push(current);
                current = current.left;
            } else {
             current = stack.pop();
             System.out.printf(" %d |", current.data);
             current = current.right;
            }

        }
    }

}
