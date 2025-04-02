package com.dieg0407.tree;

public class MaxDepthBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return maxDepth(root, 1);
    }

    public int maxDepth(final TreeNode node, final int currDepth) {
        if (node == null) {
            return currDepth;
        }

        final int leftDepth = node.left != null ? maxDepth(node.left, currDepth + 1) : currDepth;
        final int rightDepth = node.right != null ? maxDepth(node.right, currDepth + 1) : currDepth;

        return Math.max(leftDepth, rightDepth);
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
