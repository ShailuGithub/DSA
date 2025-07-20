/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loops;

/**
 *
 * @author shail
 */
public class Ceiling {

    public static void main(String[] args) {
         int[] arr = {2,3,5,9,14,16,18};
        int target = 15;
        int ans = ceiling(arr, target);
        System.out.println(ans);

    }
//return the index of smallest number >=target
    static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return start;
    }
}
