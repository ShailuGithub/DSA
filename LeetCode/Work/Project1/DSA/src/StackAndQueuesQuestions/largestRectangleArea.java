/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StackAndQueuesQuestions;

import java.util.Stack;

/**
 *
 * @author SOFTWARE
 */
//84
public class largestRectangleArea {

    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int max = 0;
        int n = heights.length;

        for (int i = 0; i < n; i++) {
            // Process all taller bars from the stack
            while (!stack.isEmpty() && heights[i] < heights[stack.peek()]) {
                int height = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i - 1 - stack.peek();
                max = Math.max(max, height * width);
            }
            stack.push(i);
        }

        // Process remaining bars in the stack
        while (!stack.isEmpty()) {
            int height = heights[stack.pop()];
            int width = stack.isEmpty() ? n : n - 1 - stack.peek();
            max = Math.max(max, height * width);
        }

        return max;
    }
}
