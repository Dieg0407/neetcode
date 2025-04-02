package com.dieg0407.tree;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DiameterOfBinaryTreeTest {

    @Test
    void example1() {
        DiameterOfBinaryTree solution = new DiameterOfBinaryTree();
        DiameterOfBinaryTree.TreeNode root = new DiameterOfBinaryTree.TreeNode(1);
        root.right = new DiameterOfBinaryTree.TreeNode(2);
        root.right.left = new DiameterOfBinaryTree.TreeNode(3);
        root.right.right = new DiameterOfBinaryTree.TreeNode(4);
        root.right.left.right = new DiameterOfBinaryTree.TreeNode(5);

        int result = solution.diameterOfBinaryTree(root);
        assertThat(result).isEqualTo(3);
    }

    @Test
    void example2() {
        DiameterOfBinaryTree solution = new DiameterOfBinaryTree();
        DiameterOfBinaryTree.TreeNode root = new DiameterOfBinaryTree.TreeNode(1);
        root.left = new DiameterOfBinaryTree.TreeNode(2);
        root.right = new DiameterOfBinaryTree.TreeNode(3);

        int result = solution.diameterOfBinaryTree(root);
        assertThat(result).isEqualTo(2);
    }
}
