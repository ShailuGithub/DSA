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
public class EvenDigits {

    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(nums));
        
        System.out.println(digits2(345678));
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) { 
            if (even(nums[i])) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        int numerbOfDigits = digits(num);
//        if (numerbOfDigits % 2 == 0) {
//            return true;
//        } else {
//            return false;
//        }
        return numerbOfDigits % 2 == 0;
    }

    static int digits(int num) {
        int count = 0;
        while (num >0) {
            count++;
            num = num / 10;
        }
        return count;
    }
    
    static int digits2(int num)
    {
        return (int)(Math.log10(num))+1;
    }
}
