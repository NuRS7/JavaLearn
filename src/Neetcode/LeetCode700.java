package Neetcode;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class LeetCode700 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        int val = 2;
        TreeNode result = searchBST(root, val);
        if (result != null) {
            System.out.println("Found node with value: " + result.val);
        } else {
            System.out.println("Value not found in BST");
        }
    }

    public static TreeNode searchBST(TreeNode root, int val) {
        if (root == null || root.val == val) {
            return root;
        }
        return (val < root.val) ? searchBST(root.left, val) : searchBST(root.right, val);
    }
}
