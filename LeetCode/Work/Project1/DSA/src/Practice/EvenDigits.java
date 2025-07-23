/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;

/**
 *
 * @author SOFTWARE
 */
public class EvenDigits {

    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        //System.out.println(digits(34555));
        //System.out.println(Even(7896));
        System.out.println(FindNumber(nums));
    }

//    static int FindNumber(int[] num) {
//        int count = 0;
//        for (int i = 0; i < num.length; i++) {
//            if (CheckEven(num[i])) {
//                count++;
//            }
//        }
//        return count;
//    }
//
//    static boolean CheckEven(int num) {
//        int NoOfDigits = digits(num);
//        if (NoOfDigits % 2 == 0) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    static int digits(int num) {
//        int count = 0;
//        while (num > 0) {
//            num = num / 10;
//            count++;
//        }
//        return count;
//    }

    static int FindNumber(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (Even(nums[i])) {
                count++;
            }
        }
        return count;
    }

    static boolean Even(int num) {
        int NoOfDigits = digits(num);
        if (NoOfDigits % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    static int digits(int num) {
        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        return count;
    }
}
