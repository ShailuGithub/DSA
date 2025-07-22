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
public class isPalindrome {

    public static void main(String[] args) {
        isPalindrome solution = new isPalindrome();
        System.out.println(solution.isPalindrome("A man, a plan, a canal: Panama")); // true
        System.out.println(solution.isPalindrome("race a car"));                     // false
    }

    public boolean isPalindrome(String s) {
        // Use two pointers
        int left = 0, right = s.length() - 1;

        while (left < right) {
            // Move left pointer if not alphanumeric
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            // Move right pointer if not alphanumeric
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // Compare characters (case insensitive)
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
