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
public class SearchInsertPosition {

    public static void main(String[] args) {
        SearchInsertPosition sol = new SearchInsertPosition();
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        System.out.println("Insert position: " + sol.searchInsert(nums, target)); // Output: 2
    }

    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid; // Target found
            } else if (nums[mid] < target) {
                left = mid + 1; // Search right half
            } else {
                right = mid - 1; // Search left half
            }
        } 
        // Target not found; left is the correct insert position
        return left;
    }

}
