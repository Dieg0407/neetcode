package com.dieg0407.tree;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LowertCommonAncestorTest {
    final LowestCommonAncestor solution = new LowestCommonAncestor();

    @Test
    void example1() {
        final LowestCommonAncestor.TreeNode root = new LowestCommonAncestor.TreeNode(5);
        root.left = new LowestCommonAncestor.TreeNode(3);
        root.left.left = new LowestCommonAncestor.TreeNode(1);
        root.left.left.right = new LowestCommonAncestor.TreeNode(2);

        root.right = new LowestCommonAncestor.TreeNode(8);
        root.right.left = new LowestCommonAncestor.TreeNode(7);
        root.right.right = new LowestCommonAncestor.TreeNode(9);

        assertThat(solution.lowestCommonAncestor(root, root.left, root.right)).isEqualTo(root);
    }

    @Test
    void example2() {
        final LowestCommonAncestor.TreeNode root = new LowestCommonAncestor.TreeNode(5);
        root.left = new LowestCommonAncestor.TreeNode(3);
        root.left.left = new LowestCommonAncestor.TreeNode(1);
        root.left.left.right = new LowestCommonAncestor.TreeNode(2);
        root.left.right = new LowestCommonAncestor.TreeNode(4);

        root.right = new LowestCommonAncestor.TreeNode(8);
        root.right.left = new LowestCommonAncestor.TreeNode(7);
        root.right.right = new LowestCommonAncestor.TreeNode(9);

        assertThat(solution.lowestCommonAncestor(root, root.left, root.left.right)).isEqualTo(root.left);
    }

    @Test
    void example3() {
        final LowestCommonAncestor.TreeNode root = new LowestCommonAncestor.TreeNode(5);
        root.left = new LowestCommonAncestor.TreeNode(3);
        root.left.left = new LowestCommonAncestor.TreeNode(1);
        root.left.left.right = new LowestCommonAncestor.TreeNode(2);
        root.left.right = new LowestCommonAncestor.TreeNode(4);

        root.right = new LowestCommonAncestor.TreeNode(8);
        root.right.left = new LowestCommonAncestor.TreeNode(7);
        root.right.right = new LowestCommonAncestor.TreeNode(9);

        assertThat(solution.lowestCommonAncestor(root, root.left.left.right, root.left.right)).isEqualTo(root.left);
    }

    @Test
    void example4() {
        final LowestCommonAncestor.TreeNode root = new LowestCommonAncestor.TreeNode(2);
        root.left = new LowestCommonAncestor.TreeNode(1);
        root.right = new LowestCommonAncestor.TreeNode(3);

        assertThat(solution.lowestCommonAncestor(root, root.left, root)).isEqualTo(root);
    }
}
