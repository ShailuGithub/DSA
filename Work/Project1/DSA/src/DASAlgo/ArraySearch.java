/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DASAlgo;

/**
 *
 * @author SOFTWARE
 */
public class ArraySearch {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int target = 3;
        System.out.println(FindIndex(arr, target));
    }

    public static int FindIndex(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

}
