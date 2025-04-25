package com.dieg0407.tree;

import static org.assertj.core.api.Assertions.assertThat;
import static com.dieg0407.tree.TreeSerializer.TreeNode;

import org.junit.jupiter.api.Test;

class TreeSerializerTest {

    @Test
    void example1() {
        final TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        final String serialized = new TreeSerializer().serialize(root);
        final TreeNode deserialized = new TreeSerializer().deserialize(serialized);

        assertThat(root.val).isEqualTo(deserialized.val);
        assertThat(root.left.val).isEqualTo(deserialized.left.val);
        assertThat(root.right.val).isEqualTo(deserialized.right.val);
        assertThat(root.left.left.val).isEqualTo(deserialized.left.left.val);
        assertThat(root.left.right.val).isEqualTo(deserialized.left.right.val);
    }

}
