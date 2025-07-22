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
public class RemoveDuplicates {
     public static void main(String[] args) {
        RemoveDuplicates rd = new RemoveDuplicates();
        int[] nums = {0, 0, 1, 1, 2, 2, 3, 4, 4};
        int k = rd.removeDuplicates(nums);
        
        System.out.println("Number of unique elements: " + k);
        System.out.print("Modified array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
     
      public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int k = 1; // Pointer for the next unique element

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}
