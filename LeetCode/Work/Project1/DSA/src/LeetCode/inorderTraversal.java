/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SOFTWARE
 */
public class inorderTraversal {

    public static void main(String[] args) {
        // Constructing the binary tree:
        //      1
        //       \
        //        2
        //       /
        //      3
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        inorderTraversal sol = new inorderTraversal();
        List<Integer> result = sol.inorderTraversal(root);

        System.out.println("Inorder Traversal:");
        System.out.println(result);  // Output should be [1, 3, 2]
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorder(root, result);
        return result;
    }

    private void inorder(TreeNode node, List<Integer> res) {
        if (node == null) {
            return;
        }
        inorder(node.left, res);    // Left
        res.add(node.val);          // Root
        inorder(node.right, res);   // Right
    }
}

class TreeNode {

    int val;
    TreeNode left, right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
