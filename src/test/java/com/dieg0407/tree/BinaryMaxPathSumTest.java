package com.dieg0407.tree;

import static org.assertj.core.api.Assertions.assertThat;
import static com.dieg0407.tree.BinaryMaxPathSum.TreeNode;

import org.junit.jupiter.api.Test;

class BinaryMaxPathSumTest {

    @Test
    void example1() {
        final TreeNode root = new BinaryMaxPathSum.TreeNode(1);
        root.left = new BinaryMaxPathSum.TreeNode(2);
        root.right = new BinaryMaxPathSum.TreeNode(3);

        final int expected = 6;
        final int actual = new BinaryMaxPathSum().maxPathSum(root);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void example2() {
        final TreeNode root = new BinaryMaxPathSum.TreeNode(-15);
        root.left = new BinaryMaxPathSum.TreeNode(10);
        root.right = new BinaryMaxPathSum.TreeNode(20);
        root.right.left = new BinaryMaxPathSum.TreeNode(15);
        root.right.left.left = new BinaryMaxPathSum.TreeNode(-5);
        root.right.right = new BinaryMaxPathSum.TreeNode(5);

        final int expected = 40;
        final int actual = new BinaryMaxPathSum().maxPathSum(root);

        assertThat(actual).isEqualTo(expected);

    }

}
