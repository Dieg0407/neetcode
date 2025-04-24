package com.dieg0407.tree;

import static org.assertj.core.api.Assertions.assertThat;
import static com.dieg0407.tree.ConstructFromPreOrderAndInOrder.TreeNode;

import org.junit.jupiter.api.Test;

class ConstructFromPreOrderAndInOrderTest {
    private final ConstructFromPreOrderAndInOrder solution = new ConstructFromPreOrderAndInOrder();

    @Test
    void example1() {
        final int[] preorder = new int[] { 1, 2, 3, 4 };
        final int[] inorder = new int[] { 2, 1, 3, 4 };

        final TreeNode expected = new TreeNode(1);
        expected.left = new TreeNode(2);
        expected.right = new TreeNode(3);
        expected.right.right = new TreeNode(4);

        final TreeNode actual = solution.buildTree(preorder, inorder);
        assertThat(actual.val).isEqualTo(expected.val);
        assertThat(actual.left.val).isEqualTo(expected.left.val);
        assertThat(actual.right.val).isEqualTo(expected.right.val);
        assertThat(actual.right.right.val).isEqualTo(expected.right.right.val);
    }

    @Test
    void example2() {
        final int[] preorder = new int[] { 1 };
        final int[] inorder = new int[] { 1 };

        final TreeNode expected = new TreeNode(1);
        final TreeNode actual = solution.buildTree(preorder, inorder);

        assertThat(actual.val).isEqualTo(expected.val);
        assertThat(actual.left).isNull();
        assertThat(actual.right).isNull();
    }
}
