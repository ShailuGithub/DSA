/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

/**
 *
 * @author SOFTWARE
 */
public class LinearSearch {

    public static void main(String[] args) {
        int[] nums = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        int target = 199;
        int ans = linearsearch(nums, target);
        System.out.println(ans);
    }

    //serach the array
    //otherwise if item not found return-1;
    static int linearsearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }

    static int linearsearch2(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return element;
            }
        }
        return -1;
    }

    static boolean linearsearch3(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return true;
            }
        }
        return false;
    }
}
