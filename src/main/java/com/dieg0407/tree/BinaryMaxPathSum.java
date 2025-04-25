package com.dieg0407.tree;

public class BinaryMaxPathSum {
    private int max = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        maxPathSumHelper(root);
        return max;
    }

    public int maxPathSumHelper(TreeNode root) {
        if (root == null) {
            return 0;
        }
        final int maxLeft = Math.max(maxPathSumHelper(root.left), 0);
        final int maxRight = Math.max(maxPathSumHelper(root.right), 0);

        final int sum = root.val + maxRight + maxLeft;
        max = Math.max(max, sum);

        return root.val + Math.max(maxRight, maxLeft);
    }

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
}
