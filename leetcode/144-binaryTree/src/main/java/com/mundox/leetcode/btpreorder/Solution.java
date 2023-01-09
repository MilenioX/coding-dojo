package com.mundox.leetcode.btpreorder;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root != null)
            return visitNode(root, result);
        else
            return Collections.EMPTY_LIST;
    }

    public List<Integer> visitNode(TreeNode node, List<Integer> result) {
        result.add(node.val);
        if (node.left != null)
            result = visitNode(node.left, result);
        if (node.right != null)
            result = visitNode(node.right, result);

        return result;
    }
}
