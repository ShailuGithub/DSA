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
public class plusOne {

    // Example usage

    public static void main(String[] args) {
        int[] digits = {9, 9, 9};
        int[] result = plusOne(digits);

        for (int digit : result) {
            System.out.print(digit + " ");
        }
    }

    public static int[] plusOne(int[] digits) {
        int n = digits.length;

        // Traverse the digits array from right to left
        for (int i = n - 1; i >= 0; i--) {
            // If current digit is less than 9, just add one and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            // If digit is 9, set to 0 and continue loop to carry over
            digits[i] = 0;
        }

        // If loop completes, all digits were 9 (e.g. 999 -> 1000)
        int[] newDigits = new int[n + 1];
        newDigits[0] = 1; // The rest are already 0 by default
        return newDigits;
    }

}
