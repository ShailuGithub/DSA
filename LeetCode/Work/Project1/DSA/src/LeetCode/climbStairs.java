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
public class climbStairs {

    public int climbStairs(int n) {
        if (n <= 1) {
            return 1;
        }
        int first = 1;
        int second = 1;

        for (int i = 2; i <= n; i++) {
            int temp = first + second;
            first = second;
            second = temp;
        }
        return second;
    }

    public static void main(String[] args) {
        climbStairs solution = new climbStairs();

        int n = 5;  // You can change this value
        int result = solution.climbStairs(n);

        System.out.println("Number of ways to climb " + n + " stairs: " + result);
    }
}
