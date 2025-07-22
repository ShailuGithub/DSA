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
public class RBS {

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        //System.out.println(findPivot(arr));
        int target = 6;
        int ans = search(arr, target);
        System.out.println(ans);
    }

    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        //if didnot find pivot
        if (pivot == -1) {
            return binarysearch(nums, target, 0, nums.length - 1);
        }
        if (nums[pivot] == target) {
            return pivot;
        }

        if (target >= nums[0]) {
            return binarysearch(nums, target, 0, nums.length - 1);
        }
        return binarysearch(nums, target, pivot + 1, nums.length - 1);
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
//this will not work in duplicate 

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid] - 1) {
                return mid - 1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    static int findPivotWithDuplicate(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid] - 1) {
                return mid - 1;
            }
            //if elements  at middle,start and end are equal then skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                //skip duplicates
                if (arr[start] > arr[start + 1]) {
                    return start;
                }

                start++;
                if (arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            } else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

}
