package com.dieg0407.tree;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InvertBinaryTreeTest {

    @Test
    void example1() {
        // root Input: root = [1,2,3,4,5,6,7]

        InvertBinaryTree solution = new InvertBinaryTree();
        InvertBinaryTree.TreeNode root = new InvertBinaryTree.TreeNode(1);
        root.left = new InvertBinaryTree.TreeNode(2);
        root.right = new InvertBinaryTree.TreeNode(3);
        root.left.left = new InvertBinaryTree.TreeNode(4);
        root.left.right = new InvertBinaryTree.TreeNode(5);
        root.right.left = new InvertBinaryTree.TreeNode(6);
        root.right.right = new InvertBinaryTree.TreeNode(7);

        InvertBinaryTree.TreeNode expected = new InvertBinaryTree.TreeNode(1);
        expected.left = new InvertBinaryTree.TreeNode(3);
        expected.right = new InvertBinaryTree.TreeNode(2);
        expected.left.left = new InvertBinaryTree.TreeNode(7);
        expected.left.right = new InvertBinaryTree.TreeNode(6);
        expected.right.left = new InvertBinaryTree.TreeNode(5);
        expected.right.right = new InvertBinaryTree.TreeNode(4);

        InvertBinaryTree.TreeNode result = solution.invertTree(root);
        assertThat(result.val).isEqualTo(expected.val);
        assertThat(result.left.val).isEqualTo(expected.left.val);
        assertThat(result.right.val).isEqualTo(expected.right.val);
        assertThat(result.left.left.val).isEqualTo(expected.left.left.val);
        assertThat(result.left.right.val).isEqualTo(expected.left.right.val);
        assertThat(result.right.left.val).isEqualTo(expected.right.left.val);
        assertThat(result.right.right.val).isEqualTo(expected.right.right.val);

    }

    @Test
    void example2() {
        // Input: root = [3,2,1]
        // Output: [3,1,2]

        InvertBinaryTree solution = new InvertBinaryTree();
        InvertBinaryTree.TreeNode root = new InvertBinaryTree.TreeNode(3);
        root.left = new InvertBinaryTree.TreeNode(2);
        root.right = new InvertBinaryTree.TreeNode(1);

        InvertBinaryTree.TreeNode expected = new InvertBinaryTree.TreeNode(3);
        expected.left = new InvertBinaryTree.TreeNode(1);
        expected.right = new InvertBinaryTree.TreeNode(2);

        InvertBinaryTree.TreeNode result = solution.invertTree(root);
        assertThat(result.val).isEqualTo(expected.val);
        assertThat(result.left.val).isEqualTo(expected.left.val);
        assertThat(result.right.val).isEqualTo(expected.right.val);

    }
}
