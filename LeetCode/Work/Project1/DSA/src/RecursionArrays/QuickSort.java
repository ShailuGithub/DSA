/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RecursionArrays;

import java.util.Arrays;

/**
 *
 * @author SOFTWARE
 */
public class QuickSort {
    
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        //sort(arr, 0, arr.length - 1);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    static void sort(int[] nums, int low, int hi) {
        if (low >= hi) {
            return;
        }
        int s = low;
        int e = hi;
        int m = s + (e - s) / 2;
        int pivot = nums[m];
        while (s <= e) {
            while (nums[s] < pivot) {
                s++;
            }
            while (nums[e] > pivot) {
                e--;
            }
            
            if (s <= e) {
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }
        sort(nums, low, e);
        sort(nums, s, hi);
    }
}
