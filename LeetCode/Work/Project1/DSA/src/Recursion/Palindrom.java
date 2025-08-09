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
public class Palindrom {

    public static void main(String[] args) {
        System.out.println(palin(1234321));
    }

    static boolean palin(int n) {
        return n == reverse1(n, 0);
    }

    static int reverse1(int n, int sum) {
        if (n == 0) {
            return sum;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        return reverse1(n / 10, sum);
    }
}
