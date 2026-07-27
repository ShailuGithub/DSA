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
public class PassingFunctions {
    public static void main(String[] args) {
        int[] nums={2,6,3,5,8};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    
    static void change(int[] arr)
    {
        arr[0]=99;
    }
}
