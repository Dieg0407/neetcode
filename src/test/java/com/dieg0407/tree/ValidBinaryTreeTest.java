package com.dieg0407.tree;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class ValidBinaryTreeTest {
    final ValidBinaryTree validBinaryTree = new ValidBinaryTree();

    @Test
    void testIsValidBST() {
        ValidBinaryTree.TreeNode root = new ValidBinaryTree.TreeNode(2);
        root.left = new ValidBinaryTree.TreeNode(1);
        root.right = new ValidBinaryTree.TreeNode(3);
        assertThat(validBinaryTree.isValidBST(root)).isTrue();
    }

    @Test
    void testIsValidBST2() {
        ValidBinaryTree.TreeNode root = new ValidBinaryTree.TreeNode(1);
        root.left = new ValidBinaryTree.TreeNode(2);
        root.right = new ValidBinaryTree.TreeNode(3);
        assertThat(validBinaryTree.isValidBST(root)).isFalse();
    }

    @Test
    void testIsValidBST3() {
        ValidBinaryTree.TreeNode root = new ValidBinaryTree.TreeNode(5);
        root.left = new ValidBinaryTree.TreeNode(4);
        root.right = new ValidBinaryTree.TreeNode(6);
        root.right.left = new ValidBinaryTree.TreeNode(3);
        root.right.right = new ValidBinaryTree.TreeNode(7);
        assertThat(validBinaryTree.isValidBST(root)).isFalse();
    }

}
