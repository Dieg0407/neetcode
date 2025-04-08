package com.dieg0407.tree;

public class LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (p.val > q.val) {
            final TreeNode temp = p;
            p = q;
            q = temp;
        }

        if (root.val == p.val || root.val == q.val) {
            return root;
        }

        final TreeNode left = root.left;
        final TreeNode right = root.right;

        if (left != null && right != null && left.val == p.val && right.val == q.val) {
            return root;
        }

        if (right != null && left != null && root.val > p.val && root.val < q.val) {
            return root;
        }

        if (left != null && (left.val == p.val || left.val == q.val)) {
            return left;
        }

        if (right != null && (right.val == p.val || right.val == q.val)) {
            return right;
        }

        final int max = q.val;
        final int min = p.val;

        if (max < root.val) {
            return lowestCommonAncestor(left, p, q);
        }

        if (min > root.val) {
            return lowestCommonAncestor(right, p, q);
        }

        throw new IllegalArgumentException("Invalid input");
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
