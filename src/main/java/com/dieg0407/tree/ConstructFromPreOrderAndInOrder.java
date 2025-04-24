package com.dieg0407.tree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class ConstructFromPreOrderAndInOrder {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        final Queue<Integer> preorderQueue = new LinkedList<>();
        for (int i : preorder) {
            preorderQueue.add(i);
        }
        final Map<Integer, Integer> inOrderMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            inOrderMap.put(inorder[i], i);
        }

        return buildTree(preorderQueue, inOrderMap, inorder, 0, inorder.length - 1);
    }

    private TreeNode buildTree(
            final Queue<Integer> preOrderQueue,
            final Map<Integer, Integer> inOrderMap,
            final int[] inorder,
            final int inStart,
            final int inEnd) {

        if (inStart > inEnd) {
            return null;
        }
        final int value = preOrderQueue.poll();
        final TreeNode node = new TreeNode(value);
        final int inIndex = inOrderMap.get(value);

        node.left = buildTree(preOrderQueue, inOrderMap, inorder, inStart, inIndex - 1);
        node.right = buildTree(preOrderQueue, inOrderMap, inorder, inIndex + 1, inEnd);

        return node;

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
