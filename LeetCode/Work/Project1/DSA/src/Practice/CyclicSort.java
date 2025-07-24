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
public class CyclicSort {

    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int currentindex = arr[i]-1;
            if (arr[i] < arr[currentindex]) {
                swap(arr, i, currentindex);
            } else {
                i++;
            }
        }
    }

//    static void sort(int[] arr) {
//        int i = 0;
//        while (i < arr.length) {
//            int currectindexvalue = arr[i] - 1;
//            if (arr[i] != arr[currectindexvalue]) {
//                swap(arr, i, currectindexvalue);
//            } else {
//                i++;
//            }
//        }
//    }
//    static void sort(int[] arr) {
//        int i = 0;
//        while (i < arr.length) {
//            int currentindex = arr[i]-1;
//            if (arr[i] != arr[currentindex]) {
//                swap(arr, i, currentindex);
//            } else {
//                i++;
//            }
//        }
//    }
    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

//    static void sort(int[] arr) {
//        int i = 0;
//        while (i < arr.length) {
//            int currentidex = arr[i] - 1;
//            if (arr[i] != arr[currentidex]) {
//                swap(arr, i, currentidex);
//            } else {
//                i++;
//            }
//        }
//    }
//    static void sort(int[] arr) {
//        int i = 0;
//        while (i < arr.length) {
//            int currentindex = arr[i] - 1;
//            if (arr[i] != arr[currentindex]) {
//                swap(arr, i, currentindex);
//            } else {
//                i++;
//            }
//        }
//    }
}
