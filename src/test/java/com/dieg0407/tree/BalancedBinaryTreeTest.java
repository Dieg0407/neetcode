package com.dieg0407.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class BalancedBinaryTreeTest {

    @Test
    void testIsBalanced() {
        BalancedBinaryTree balancedBinaryTree = new BalancedBinaryTree();
        BalancedBinaryTree.TreeNode root = new BalancedBinaryTree.TreeNode(1);
        root.left = new BalancedBinaryTree.TreeNode(2);
        root.right = new BalancedBinaryTree.TreeNode(3);
        root.right.left = new BalancedBinaryTree.TreeNode(4);

        assertTrue(balancedBinaryTree.isBalanced(root));
    }

    @Test
    void testIsBalanced2() {
        BalancedBinaryTree balancedBinaryTree = new BalancedBinaryTree();
        BalancedBinaryTree.TreeNode root = new BalancedBinaryTree.TreeNode(1);
        root.left = new BalancedBinaryTree.TreeNode(2);
        root.right = new BalancedBinaryTree.TreeNode(3);
        root.right.left = new BalancedBinaryTree.TreeNode(4);
        root.right.left.left = new BalancedBinaryTree.TreeNode(5);

        assertFalse(balancedBinaryTree.isBalanced(root));
    }
}
