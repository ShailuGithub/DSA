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
public class mySqrt {
    public int mySqrt(int x) {
        if (x < 2) return x;

        int left = 1, right = x / 2, result = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long midSquared = (long) mid * mid;

            if (midSquared == x) {
                return mid;
            } else if (midSquared < x) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    // Main method to run the program
    public static void main(String[] args) {
        mySqrt solution = new mySqrt();

        int x = 10; // You can change this to test other values
        int sqrt = solution.mySqrt(x);

        System.out.println("Square root of " + x + " is: " + sqrt);
    }
}
