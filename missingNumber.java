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
public class missingNumber {
//https://leetcode.com/problems/missing-number/submissions/1707123769/
    public static void main(String[] args) {
        int[] arr = {4, 0, 2, 1};
        System.out.println(missingNumber(arr));
//        System.out.println(Arrays.toString(arr));
    }

//    static int sort(int[] arr) {
//        int i = 0;
//        while (i < arr.length) {
//            int correctIndex = arr[i] - 1;
//            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correctIndex]) {
//                swap(arr, i, correctIndex);
//            } else {
//                i++;
//            }
//        }
//
//        for (int index = 0; index < arr.length; index++) {
//            if (arr[index] != index) {
//                return index;
//            }
//        }
//        return arr.length;
//    }
    static int missingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }

        //search for first missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index;
            }
        }
        
        return arr.length;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
