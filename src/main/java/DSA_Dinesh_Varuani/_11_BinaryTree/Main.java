package DSA_Dinesh_Varuani._11_BinaryTree;

import static DSA_Dinesh_Varuani._11_BinaryTree.TreeNode.*;

public class Main {
    private static TreeNode<Integer> root;

    public static void main(String[] args) {
        TreeNode<Integer> first = new TreeNode<>(1);
        TreeNode<Integer> sec = new TreeNode<>(2);
        TreeNode<Integer> third = new TreeNode<>(3);
        TreeNode<Integer> four = new TreeNode<>(4);
        TreeNode<Integer> five = new TreeNode<>(5);
        TreeNode<Integer> six = new TreeNode<>(3);
        root = first;
        first.setLeft(sec);
        first.setRight(third);
        third.setLeft(six);
        sec.setLeft(four);
        sec.setRight(five);

        System.out.println("Preorder Traversal:");
        preOrderRecursion(root);
        System.out.println("");
        preOrderIterative(root);
        System.out.println("");
        System.out.println("Inorder Traversal:");
        inOrderRecursion(root);
        System.out.println("");
        inOrderIterative(root);
    }




}
