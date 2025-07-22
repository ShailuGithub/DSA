/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author SOFTWARE
 */
public class HappyNumber {

    public static boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();

        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = getNext(n);
        }

        return n == 1;
    }

    private static int getNext(int number) {
        int totalSum = 0;
        while (number > 0) {
            int digit = number % 10;
            totalSum += digit * digit;
            number /= 10;
        }
        return totalSum;
    }

    // Example usage
    public static void main(String[] args) {
        int n = 19;
        System.out.println(n + " is happy? " + isHappy(n));  // Output: true
    }
}
