package com.dieg0407.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SameBinaryTreeTest {

    @Test
    void example1() {
        SameBinaryTree sameBinaryTree = new SameBinaryTree();
        SameBinaryTree.TreeNode p = new SameBinaryTree.TreeNode(1);
        p.left = new SameBinaryTree.TreeNode(2);
        p.right = new SameBinaryTree.TreeNode(3);
        SameBinaryTree.TreeNode q = new SameBinaryTree.TreeNode(1);
        q.left = new SameBinaryTree.TreeNode(2);
        q.right = new SameBinaryTree.TreeNode(3);

        assertTrue(sameBinaryTree.isSameTree(p, q));
    }

    @Test
    void example2() {
        SameBinaryTree sameBinaryTree = new SameBinaryTree();
        SameBinaryTree.TreeNode p = new SameBinaryTree.TreeNode(4);
        p.left = new SameBinaryTree.TreeNode(7);
        SameBinaryTree.TreeNode q = new SameBinaryTree.TreeNode(4);
        q.right = new SameBinaryTree.TreeNode(7);

        assertFalse(sameBinaryTree.isSameTree(p, q));
    }

    @Test
    void example3() {
        SameBinaryTree sameBinaryTree = new SameBinaryTree();
        SameBinaryTree.TreeNode p = new SameBinaryTree.TreeNode(1);
        p.left = new SameBinaryTree.TreeNode(2);
        p.right = new SameBinaryTree.TreeNode(3);

        SameBinaryTree.TreeNode q = new SameBinaryTree.TreeNode(1);
        q.left = new SameBinaryTree.TreeNode(3);
        q.right = new SameBinaryTree.TreeNode(2);

        assertFalse(sameBinaryTree.isSameTree(p, q));
    }

}
