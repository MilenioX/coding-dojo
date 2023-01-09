package com.mundox.leetcode.btpreorder;

import org.junit.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void preOrderBinaryTree_with_elements() {
        TreeNode two = new TreeNode(2);
        two.left = new TreeNode(3);
        TreeNode root = new TreeNode(1,null,two);
        Solution sol = new Solution();
        assertEquals(List.of(1,2,3), sol.preorderTraversal(root));
    }

    @Test
    public void preOrderBinaryTree_empty() {
        Solution sol = new Solution();
        assertEquals(Collections.EMPTY_LIST, sol.preorderTraversal(null));
    }

    @Test
    public void preOrderBinaryTree_one_element() {
        TreeNode root = new TreeNode(1);
        Solution sol = new Solution();
        assertEquals(List.of(1), sol.preorderTraversal(root));
    }
}
