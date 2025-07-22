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
public class RemoveElement {
    public static void main(String[] args) {
        RemoveElement obj = new RemoveElement();
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int k = obj.removeElement(nums, val);
        System.out.println("k = " + k);
        System.out.print("Modified array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
    
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int n = nums.length;

         while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[n - 1]; // Replace with the last element
                n--; // Reduce the array size
            } else {
                i++;
            }
        }

        return n;
    }
}
