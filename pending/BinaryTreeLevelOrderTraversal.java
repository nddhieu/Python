package pending;
import java.util.*;

public class BinaryTreeLevelOrderTraversal {

    /*
     * PROBLEM:
     * Given the root of a binary tree, return the level order traversal of its
     * nodes' values.
     * (i.e., from left to right, level by level).
     *
     * EXAMPLES:
     * Input: root = [3,9,20,null,null,15,7] -> Output: [[3],[9,20],[15,7]]
     * Input: root = [1] -> Output: [[1]]
     * Input: root = [] -> Output: []
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

    public List<List<Integer>> levelOrder(TreeNode root) {
        // TODO: Implement BFS solution
        return new ArrayList<>(); // Placeholder return
    }

    public static void main(String[] args) {
        BinaryTreeLevelOrderTraversal solver = new BinaryTreeLevelOrderTraversal();

        // Test Case 1: [3,9,20,null,null,15,7]
        TreeNode root1 = new TreeNode(3);
        root1.left = new TreeNode(9);
        root1.right = new TreeNode(20, new TreeNode(15), new TreeNode(7));

        List<List<Integer>> result1 = solver.levelOrder(root1);
        System.out.println("Test 1: " + result1 + " [Expect [[3], [9, 20], [15, 7]]]");

        // Test Case 2: []
        TreeNode root2 = null;
        List<List<Integer>> result2 = solver.levelOrder(root2);
        System.out.println("Test 2: " + result2 + " [Expect []]");
    }
}
