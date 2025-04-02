package com.dieg0407.tree;

public class DiameterOfBinaryTree {
    private int max = Integer.MIN_VALUE;

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        maxDepth(root, 1);
        return max;
    }

    public int maxDepth(final TreeNode node, final int currDepth) {
        if (node == null) {
            return currDepth - 1;
        }

        final int leftMax = maxDepth(node.left, currDepth + 1);
        final int rightMax = maxDepth(node.right, currDepth + 1);

        final int width = leftMax - currDepth + rightMax - currDepth;
        max = Math.max(max, width);

        return Math.max(rightMax, leftMax);
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
