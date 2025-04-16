package com.dieg0407.tree;

public class KthSmallestInteger {
    private int count = 0;

    public int kthSmallest(TreeNode root, int k) {
        // check left
        if (root.left != null) {
            final int result = kthSmallest(root.left, k);
            if (result != -1) {
                return result;
            }
        }
        if (count == k) {
            return root.val;
        }

        // check current
        count++;
        if (count == k) {
            return root.val;
        }

        // check right
        if (root.right != null) {
            final int result = kthSmallest(root.right, k);
            if (result != -1) {
                return result;
            }
        }

        return -1;
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
