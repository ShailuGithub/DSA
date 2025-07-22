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
public class AddBinary {

    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        // Loop through both strings from end to start
        while (i >= 0 || j >= 0 || carry == 1) {
            int sum = carry;

            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }

            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }

            result.append(sum % 2);   // Append current binary digit
            carry = sum / 2;          // Calculate carry for next iteration
        }

        return result.reverse().toString();
    }

    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";
        System.out.println("Sum: " + addBinary(a, b)); // Output: 10101
    }
}
