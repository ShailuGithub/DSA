/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinarySearch;

import java.util.Arrays;

/**
 *
 * @author SOFTWARE
 */
public class MergeSortedArray {

    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        MergeSortedArray sol = new MergeSortedArray();

        // Example test case
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};
        int m = 3;
        int n = 3;

        System.out.println("Before merge:");
        printArray(nums1);

        sol.merge(nums1, m, nums2, n);

        System.out.println("After merge:");
        printArray(nums1);
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;           // pointer for nums1
        int p2 = n - 1;           // pointer for nums2
        int p = m + n - 1;        // pointer for the merged array (nums1)

        // Fill nums1 from the back
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }

        // If there are remaining elements in nums2
        while (p2 >= 0) {
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }
    }
}
