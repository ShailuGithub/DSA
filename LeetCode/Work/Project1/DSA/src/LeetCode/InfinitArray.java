/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loops;

/**
 *
 * @author SOFTWARE
 */
public class InfinitArray {

    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(ans(arr, target));
    }

    static int ans(int[] arr, int target) {
        //first find the range
        //start with the size of box 2
        int start = 0;
        int end = 1;

        while (target > arr[end]) {
            int newStart = end + 1;
            //double  the box value
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return binarysearch(arr, target, start, end);
    }

    static int binarysearch(int[] arr, int target, int start, int end) {

        while (start <= end) {
            //find the middle element
            //int mid = (start + end) / 2;//might be possible that (start+end) exceeds range of integer
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
