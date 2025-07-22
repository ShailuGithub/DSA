/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.Arrays;

/**
 *
 * @author SOFTWARE
 */
public class ArraySwap {

    public static void main(String[] args) {
        int[] arr = {1, 33, 23, 9, 18};
        //swap(arr, 2, 3);
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

//    static void swap(int[] arr, int index1, int index2) {
//        int temp = arr[index1];
//        arr[index1] = arr[index2];
//        arr[index2] = temp;
//    }
//      static void reverse(int[] arr) {
//        int start = 0;
//        int end = arr.length - 1;
//        
//        while (start < end) {
//            swap(arr, start, end);
//            start++;
//            end--;
//        }
//    }
//    static void reverse(int[] arr)
//    {
//        int left=0;
//        int right=arr.length-1;
//        
//        while(left<right)
//        {
//            int temp=arr[left];
//            arr[left]=arr[right];
//            arr[right]=temp;
//            left++;
//            right--;
//        }
//    }
    static void reverse(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            swap(arr, left, right);
            left++;
            right--;
        }
    }
}
