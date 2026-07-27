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
public class PrefixSumExample {

    public static void main(String[] args) {
        int[] nums = {3, 1, 4, 2, 5};
//        int[] prefix = new int[nums.length];
//        //prefix[0] = nums[0];
//
//        for (int i = 1; i < nums.length; i++) {
//            prefix[i] = prefix[i - 1] + nums[i];
//        }
//
//        for (int x : prefix) {
//            System.out.print(x + " ");
//        }

        int prefix = 0;

//        for (int i = 0; i < nums.length; i++) {
//            prefix += nums[i];
//            System.out.print(prefix + " ");
//        }
        for (int num : nums) {
            prefix += num;
            System.out.print(prefix + " ");
        }

    }

}
