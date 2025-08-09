/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RecursionArrays;

/**
 *
 * @author SOFTWARE
 */
public class BinarySerach {

    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 1, 2, 3};
        int target = 7;
        System.out.println(find(arr, target, 0, arr.length - 1));
    }

    static int find(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1; 
        }
        int mid = s + (e - s) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (target < arr[mid]) {
            return find(arr, target, s, mid - 1);
        }
        return find(arr, target, mid + 1, e);
    }
}
