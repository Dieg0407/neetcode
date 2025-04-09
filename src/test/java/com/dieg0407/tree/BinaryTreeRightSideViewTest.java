package com.dieg0407.tree;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;

class BinaryTreeRightSideViewTest {
    private final BinaryTreeRightSideView solution = new BinaryTreeRightSideView();

    @Test
    void example1() {
        final BinaryTreeRightSideView.TreeNode root = new BinaryTreeRightSideView.TreeNode(1);
        root.left = new BinaryTreeRightSideView.TreeNode(2);
        root.right = new BinaryTreeRightSideView.TreeNode(3);

        assertThat(solution.rightSideView(root)).isEqualTo(List.of(1, 3));
    }

    @Test
    void example2() {
        final BinaryTreeRightSideView.TreeNode root = new BinaryTreeRightSideView.TreeNode(1);
        root.left = new BinaryTreeRightSideView.TreeNode(2);
        root.right = new BinaryTreeRightSideView.TreeNode(3);
        root.left.right = new BinaryTreeRightSideView.TreeNode(5);
        root.right.right = new BinaryTreeRightSideView.TreeNode(4);

        assertThat(solution.rightSideView(root)).isEqualTo(List.of(1, 3, 4));
    }
}
