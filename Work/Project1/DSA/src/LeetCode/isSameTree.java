/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

/**
 *
 * @author SOFTWARE
 */
public class isSameTree {

    public static void main(String[] args) {
        TreeNode p = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode q = new TreeNode(1, new TreeNode(2), new TreeNode(3));

        isSameTree solution = new isSameTree();
        boolean result = solution.isSameTree(p, q);
        System.out.println("Trees are same: " + result);  // Output: true
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        // Both nodes are null
        if (p == null && q == null) {
            return true;
        }

        // One of the nodes is null or values differ
        if (p == null || q == null || p.val != q.val) {
            return false;
        }

        // Recursively compare left and right subtrees
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

}
