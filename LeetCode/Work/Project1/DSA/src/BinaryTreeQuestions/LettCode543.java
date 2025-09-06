/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinaryTreeQuestions;

/**
 *
 * @author SOFTWARE
 */
public class LettCode543 {

    public class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

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

    int diameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter - 1;
    }

    int height(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftheight = height(node.left);
        int rightheight = height(node.right);

        int dia = leftheight = rightheight + 1;
        diameter = Math.max(diameter, dia);

        return Math.max(leftheight, rightheight) + 1;
    }

}
