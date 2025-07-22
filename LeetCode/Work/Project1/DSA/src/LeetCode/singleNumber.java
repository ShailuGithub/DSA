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
public class singleNumber {

    public static int singleNumber1(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }

    public static void main(String[] args) {
        // Example input
        int[] nums = {4, 1, 2, 1, 2};

        // Call the method and print the result
        int unique = singleNumber1(nums);
        System.out.println("The single number is: " + unique);
    }
}
