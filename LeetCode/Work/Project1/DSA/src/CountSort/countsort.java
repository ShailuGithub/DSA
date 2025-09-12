/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CountSort;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author SOFTWARE
 */
public class countsort {

    public static void main(String[] args) {
        int[] arr = {6, 3, 10, 9, 2, 4, 9, 7};
        //CountSort(arr);
        CountSortHash(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void CountSort(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }
        int max = array[0];

        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }

        int[] countarray = new int[max + 1];

        for (int num : array) {
            countarray[num]++;
        }

        int index = 0;
        for (int i = 0; i <= max; i++) {
            while (countarray[i] > 0) {
                array[index] = i;
                index++;
                countarray[i]--;
            }
        }
    }

    public static void CountSortHash(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }

        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();

        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        int index = 0;

        for (int i = min; i <= max; i++) {
            int count = countMap.getOrDefault(i, 0);
            for (int j = 0; j < count; j++) {
                arr[index] = i;
                index++;
            }
        }
    }
}
