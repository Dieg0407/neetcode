package com.dieg0407.tree;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaxDepthBinaryTreeTest {

    @Test
    void example1() {
        MaxDepthBinaryTree solution = new MaxDepthBinaryTree();
        MaxDepthBinaryTree.TreeNode root = new MaxDepthBinaryTree.TreeNode(1);
        root.left = new MaxDepthBinaryTree.TreeNode(2);
        root.right = new MaxDepthBinaryTree.TreeNode(3);
        root.right.left = new MaxDepthBinaryTree.TreeNode(4);

        int result = solution.maxDepth(root);
        assertThat(result).isEqualTo(3);

    }

    @Test
    void example2() {
        MaxDepthBinaryTree solution = new MaxDepthBinaryTree();
        MaxDepthBinaryTree.TreeNode root = null;

        int result = solution.maxDepth(root);
        assertThat(result).isEqualTo(0);
    }
}
