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
public class SearchInRange {
    public static void main(String[] args) {
         int[] nums = {18,12,-7,3,14,28};
        int start=1;
        int end =4;
        int target=14;
        int ans = linearsearch(nums, target,start,end);
        System.out.println(ans);
    }
    
      static int linearsearch(int[] arr, int target,int start,int end) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = start; index <= end; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }
    
}
