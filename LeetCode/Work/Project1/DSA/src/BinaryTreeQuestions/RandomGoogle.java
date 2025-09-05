/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinaryTreeQuestions;

import BinaryTreeQuestions.LettCode102.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author SOFTWARE
 */
public class RandomGoogle {

    public static void main(String[] args) {
        // Construct the binary tree:
        //
        //         3
        //        / \
        //       9  20
        //          / \
        //         15  7
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

//        LettCode637 solution = new LettCode637();
//        List<Double> averages = solution.averageOfLevels(root);
//
//        System.out.println("Average of levels:");
//        for (Double avg : averages) {
//            System.out.println(avg);
//        }
    }

    public TreeNode findSuccessor(TreeNode root, int key) {
        if (root == null) {
            return null;
        }

        Queue<TreeNode> queue = new LinkedList();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode currentNode = queue.poll();
            if (currentNode.left != null) {
                queue.offer(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.offer(currentNode.right);
            }
            if (currentNode.val == key) {
                break;
            }
        }

        return queue.peek();
    }
}
