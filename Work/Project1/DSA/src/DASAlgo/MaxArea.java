/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DASAlgo;

/**
 *
 * @author SOFTWARE
 */
public class MaxArea {

    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(MaxArea(height));
    }

    public static int MaxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;
        int maxarea = 0;

        while (left < right) {
            int width = right - left;
            int h = Math.min(height[left], height[right]);
            int area = width * h;

            maxarea = Math.max(maxarea, area);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxarea;
    }
}
