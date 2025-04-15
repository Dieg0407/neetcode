package com.dieg0407.tree;

import java.util.ArrayList;
import java.util.List;

public class CountGoodNodes {
    public int goodNodes(TreeNode root) {
        final List<Integer> goodNodes = new ArrayList<>();
        countGoodNodes(root, Integer.MIN_VALUE, goodNodes);

        return goodNodes.size();
    }

    public void countGoodNodes(TreeNode root, int max, List<Integer> goodNodes) {
        if (root == null) {
            return;
        }

        if (root.val >= max) {
            goodNodes.add(root.val);
        }

        countGoodNodes(root.left, Math.max(max, root.val), goodNodes);
        countGoodNodes(root.right, Math.max(max, root.val), goodNodes);
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
