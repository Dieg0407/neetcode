package com.dieg0407.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return List.of();
        }

        final List<List<Integer>> result = new ArrayList<>();

        traverse(List.of(root), result);

        return result;
    }

    private void traverse(List<TreeNode> nodes, List<List<Integer>> result) {
        if (nodes.isEmpty()) {
            return;
        }
        List<TreeNode> newLevel = new ArrayList<>();
        for (TreeNode node : nodes) {
            if (node.left != null) {
                newLevel.add(node.left);
            }

            if (node.right != null) {
                newLevel.add(node.right);
            }
        }
        result.add(nodes.stream().map(n -> n.val).collect(Collectors.toList()));
        traverse(newLevel, result);
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
