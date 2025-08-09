/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

/**
 *
 * @author SOFTWARE
 */
public class Steps {

    public static void main(String[] args) {
        //System.out.println(ans(14,0));
        System.out.println(numberOfSteps(14));
    }

    static public int numberOfSteps(int num) {
        return Helper(num, 0);
    }

    static int Helper(int n, int steps) {
        if (n == 0) {
            return steps;
        }

        if (n % 2 == 0) {
            return Helper(n / 2, steps + 1);
        }
        return Helper(n - 1, steps + 1);
    }

//    static int ans(int n, int steps) {
//        if (n == 0) {
//            return steps;
//        }
//
//        if (n % 2 == 0) {
//            return ans(n / 2, steps + 1);
//        }
//        return ans(n - 1, steps + 1);
//    }
}
