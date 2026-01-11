import java.util.*;

public class ValidateBinarySearchTree {

    /*
     * PROBLEM:
     * Given the root of a binary tree, determine if it is a valid binary search
     * tree (BST).
     *
     * A valid BST is defined as follows:
     * - The left subtree of a node contains only nodes with keys less than the
     * node's key.
     * - The right subtree of a node contains only nodes with keys greater than the
     * node's key.
     * - Both the left and right subtrees must also be binary search trees.
     *
     * EXAMPLES:
     * Input: root = [2,1,3] -> Output: true
     * Input: root = [5,1,4,null,null,3,6] -> Output: false
     */

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean isValidBST(TreeNode root) {
        // TODO: Implement DFS solution
        return false; // Placeholder return
    }

    public static void main(String[] args) {
        ValidateBinarySearchTree solver = new ValidateBinarySearchTree();

        // Test Case 1: [2,1,3] -> True
        TreeNode root1 = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        boolean result1 = solver.isValidBST(root1);
        System.out.println("Test 1: " + result1 + (result1 ? " [PASS]" : " [FAIL expected true]"));

        // Test Case 2: [5,1,4,null,null,3,6] -> False
        TreeNode root2 = new TreeNode(5);
        root2.left = new TreeNode(1);
        root2.right = new TreeNode(4, new TreeNode(3), new TreeNode(6));

        boolean result2 = solver.isValidBST(root2);
        System.out.println("Test 2: " + result2 + (!result2 ? " [PASS]" : " [FAIL expected false]"));
    }
}
