/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author SOFTWARE
 */
public class FindDuplicate {

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};
        System.out.println(findDuplicate(arr));
        //System.out.println(findDuplicateList(arr));
    }

    static List<Integer> findDuplicateList(int[] arr) {
        int i = 0;
        while (i < arr.length) {

            int currentindex = arr[i] - 1;
            if (arr[i] != arr[currentindex]) {
                swap(arr, i, currentindex);
            } else {
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                ans.add(arr[index]);
            }
        }
        return ans;
    }

    static int findDuplicate(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != i + 1) {
                int currentindex = arr[i] - 1;
                if (arr[i] != arr[currentindex]) {
                    swap(arr, i, currentindex);
                } else {
                    return arr[i];
                }
            } else {
                i++;
            }
        }
        //        System.out.println(Arrays.toString(arr));
        return -1;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
