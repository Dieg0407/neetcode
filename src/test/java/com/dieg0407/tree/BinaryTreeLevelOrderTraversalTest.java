package com.dieg0407.tree;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

class BinaryTreeLevelOrderTraversalTest {
    private BinaryTreeLevelOrderTraversal solution = new BinaryTreeLevelOrderTraversal();

    @Test
    void example1() {
        final BinaryTreeLevelOrderTraversal.TreeNode root = new BinaryTreeLevelOrderTraversal.TreeNode(1);
        root.left = new BinaryTreeLevelOrderTraversal.TreeNode(2);
        root.right = new BinaryTreeLevelOrderTraversal.TreeNode(3);
        root.left.left = new BinaryTreeLevelOrderTraversal.TreeNode(4);
        root.left.right = new BinaryTreeLevelOrderTraversal.TreeNode(5);
        root.right.left = new BinaryTreeLevelOrderTraversal.TreeNode(6);
        root.right.right = new BinaryTreeLevelOrderTraversal.TreeNode(7);

        assertThat(solution.levelOrder(root)).isEqualTo(List.of(
                List.of(1),
                List.of(2, 3),
                List.of(4, 5, 6, 7)));
    }

    @Test
    void example2() {
        final BinaryTreeLevelOrderTraversal.TreeNode root = new BinaryTreeLevelOrderTraversal.TreeNode(1);
        root.left = new BinaryTreeLevelOrderTraversal.TreeNode(2);
        root.right = new BinaryTreeLevelOrderTraversal.TreeNode(3);

        assertThat(solution.levelOrder(root)).isEqualTo(List.of(
                List.of(1),
                List.of(2, 3)));
    }

    @Test
    void example3() {
        final BinaryTreeLevelOrderTraversal.TreeNode root = new BinaryTreeLevelOrderTraversal.TreeNode(1);

        assertThat(solution.levelOrder(root)).isEqualTo(List.of(
                List.of(1)));
    }

    @Test
    void example4() {
        final BinaryTreeLevelOrderTraversal.TreeNode root = null;

        assertThat(solution.levelOrder(root)).isEqualTo(List.of());
    }

}
