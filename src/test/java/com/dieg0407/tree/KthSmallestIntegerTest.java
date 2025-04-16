package com.dieg0407.tree;

import static org.assertj.core.api.Assertions.assertThat;
import static com.dieg0407.tree.KthSmallestInteger.TreeNode;

import org.junit.jupiter.api.Test;

class KthSmallestIntegerTest {

    @Test
    void example1() {
        final TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);

        final KthSmallestInteger kthSmallestInteger = new KthSmallestInteger();
        final int result = kthSmallestInteger.kthSmallest(root, 1);
        assertThat(result).isEqualTo(1);
    }

    @Test
    void example2() {
        final TreeNode root = new TreeNode(4);
        root.left = new TreeNode(3);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(2);

        final KthSmallestInteger kthSmallestInteger = new KthSmallestInteger();
        final int result = kthSmallestInteger.kthSmallest(root, 1);
        assertThat(result).isEqualTo(2);
    }

    @Test
    void example3() {
        final TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);

        final KthSmallestInteger kthSmallestInteger = new KthSmallestInteger();
        final int result = kthSmallestInteger.kthSmallest(root, 3);
        assertThat(result).isEqualTo(4);
    }
}
