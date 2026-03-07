package leetCode.GOOGLE;

/**
  Definition for a binary tree node.
 **/
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }


class Solution543 {
    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter;
    }

    private int height(TreeNode node){
        if(node == null) return 0;
        int left = height(node.left);
        int right = height(node.right);

        diameter = Math.max(diameter, left+right);

        return 1 + Math.max(left,right);
    }

    /**
     *      1
     *     / \
     *    2   3
     *   / \
     *  4   5
     * @param args
     */
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        Solution543 solution543 = new Solution543();
        int diameter = solution543.diameterOfBinaryTree(root);
        System.out.println("Diameter of Binary Tree: " + diameter); // Expected output: 4
    }
}

