/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;

import java.util.Arrays;

/**
 *
 * @author SOFTWARE
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2, 3};
        //sort(arr);
        sortByMin(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = GetMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    static void sortByMin(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - 1;
            int minindex = GetMinIndex(arr, i, last);
            swap(arr, i, minindex);
        }
    }

    static int GetMinIndex(int[] arr, int start, int end) {
        int min = start;
        for (int i = start; i <= end; i++) {
            if (arr[min] > arr[i]) {
                min = i;
            }
        }
        return min;
    }

    private static int GetMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int j = start; j <= end; j++) {
            if (arr[max] < arr[j]) {
                max = j;
            }
        }
        return max;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
