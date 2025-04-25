package com.dieg0407.tree;

import java.util.LinkedList;
import java.util.Queue;

public class TreeSerializer {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) {
            return "";
        }

        final StringBuilder sb = new StringBuilder();
        final Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);
        sb.append(root.val).append(",");

        while (!queue.isEmpty()) {
            final TreeNode node = queue.poll();
            final TreeNode left = node.left;
            if (left == null) {
                sb.append("null,");
            } else {
                sb.append(left.val).append(",");
                queue.add(left);
            }

            final TreeNode right = node.right;
            if (right == null) {
                sb.append("null,");
            } else {
                sb.append(right.val).append(",");
                queue.add(right);
            }
        }

        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data == null || data.isEmpty()) {
            return null;
        }
        final String[] nodes = data.split(",");
        if (nodes.length == 0) {
            return null;
        }
        final Queue<TreeNode> queue = new LinkedList<>();
        final TreeNode root = new TreeNode(Integer.parseInt(nodes[0]));
        queue.add(root);

        int i = 1;
        while (!queue.isEmpty()) {
            final TreeNode node = queue.poll();

            final String leftValue = nodes[i++];
            final String rightValue = nodes[i++];

            if (!leftValue.equals("null")) {
                final TreeNode left = new TreeNode(Integer.parseInt(leftValue));
                node.left = left;
                queue.add(left);
            }
            if (!rightValue.equals("null")) {
                final TreeNode right = new TreeNode(Integer.parseInt(rightValue));
                node.right = right;
                queue.add(right);
            }
        }

        return root;
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
