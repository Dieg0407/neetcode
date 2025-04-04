package com.dieg0407.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SubTreeOfAnotherTest {

    @Test
    void test() {
        // Input: root = [1,2,3,4,5], subRoot = [2,4,5]
        // Output: true

        SubTreeOfAnother.TreeNode root = new SubTreeOfAnother.TreeNode(1,
                new SubTreeOfAnother.TreeNode(2, new SubTreeOfAnother.TreeNode(4), new SubTreeOfAnother.TreeNode(5)),
                new SubTreeOfAnother.TreeNode(3));
        SubTreeOfAnother.TreeNode subRoot = new SubTreeOfAnother.TreeNode(2, new SubTreeOfAnother.TreeNode(4),
                new SubTreeOfAnother.TreeNode(5));

        assertEquals(true, new SubTreeOfAnother().isSubtree(root, subRoot));
    }

    @Test
    void test2() {
        // Input: root = [1,2,3,4,5,null,null,6], subRoot = [2,4,5]
        // output false

        SubTreeOfAnother.TreeNode root = new SubTreeOfAnother.TreeNode(1);
        root.left = new SubTreeOfAnother.TreeNode(2);
        root.right = new SubTreeOfAnother.TreeNode(3);
        root.left.left = new SubTreeOfAnother.TreeNode(4);
        root.left.right = new SubTreeOfAnother.TreeNode(5);
        root.left.left.left = new SubTreeOfAnother.TreeNode(6);

        SubTreeOfAnother.TreeNode subRoot = new SubTreeOfAnother.TreeNode(2);
        subRoot.left = new SubTreeOfAnother.TreeNode(4);
        subRoot.right = new SubTreeOfAnother.TreeNode(5);

        assertEquals(false, new SubTreeOfAnother().isSubtree(root, subRoot));
    }

    @Test
    void test3() {
        // root=[1,1]
        // subRoot=[1]

        SubTreeOfAnother.TreeNode root = new SubTreeOfAnother.TreeNode(1);
        root.left = new SubTreeOfAnother.TreeNode(1);

        SubTreeOfAnother.TreeNode subRoot = new SubTreeOfAnother.TreeNode(1);

        assertEquals(true, new SubTreeOfAnother().isSubtree(root, subRoot));

    }

}
