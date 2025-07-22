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
public class isUgly {
    
 // Function to check if the number is ugly
    public boolean isUgly(int n) {
        // Base case: Negative numbers and zero are not ugly numbers
        if (n <= 0) {
            return false;
        }

        // Divide by 2, 3, and 5 until it's no longer divisible by them
        while (n % 2 == 0) {
            n /= 2;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        while (n % 5 == 0) {
            n /= 5;
        }

        // If the remaining number is 1, it's an ugly number
        return n == 1;
    }

    // Main method to test the solution
    public static void main(String[] args) {
        isUgly solution = new isUgly();

        // Test cases
        int[] testCases = {4,6, 8, 14, 1, -1, 0, 15, 30,36};

        for (int n : testCases) {
            System.out.println("Is " + n + " an ugly number? " + solution.isUgly(n));
        }
    }
}
