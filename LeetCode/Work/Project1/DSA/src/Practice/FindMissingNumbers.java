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
public class FindMissingNumbers {

    public static void main(String[] args) {
        int[] arr = {4, 0, 2, 1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(sort(arr));
    }

    static int sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int currentindex = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[currentindex]) {
                swap(arr, i, arr[i]);
            } else {
                i++;
            }
        }

        //search for missing index
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
