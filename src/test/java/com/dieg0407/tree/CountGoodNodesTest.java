package com.dieg0407.tree;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class CountGoodNodesTest {
    final CountGoodNodes countGoodNodes = new CountGoodNodes();

    @Test
    void testCountGoodNodes() {
        CountGoodNodes.TreeNode root = new CountGoodNodes.TreeNode(2);
        root.left = new CountGoodNodes.TreeNode(1);
        root.left.left = new CountGoodNodes.TreeNode(3);
        root.right = new CountGoodNodes.TreeNode(1);
        root.right.left = new CountGoodNodes.TreeNode(1);
        root.right.right = new CountGoodNodes.TreeNode(5);

        assertThat(countGoodNodes.goodNodes(root)).isEqualTo(3);
    }

    @Test
    void testCountGoodNodes2() {
        CountGoodNodes.TreeNode root = new CountGoodNodes.TreeNode(1);
        root.left = new CountGoodNodes.TreeNode(2);
        root.left.left = new CountGoodNodes.TreeNode(3);
        root.left.right = new CountGoodNodes.TreeNode(4);
        root.right = new CountGoodNodes.TreeNode(-1);

        assertThat(countGoodNodes.goodNodes(root)).isEqualTo(4);
    }

}
