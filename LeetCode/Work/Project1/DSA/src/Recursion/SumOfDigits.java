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
public class SumOfDigits {

    public static void main(String[] args) {
        int n = 1342;
        System.out.println(Sum(n));
    }

    static int Sum(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + Sum(n / 10);
    }
}
