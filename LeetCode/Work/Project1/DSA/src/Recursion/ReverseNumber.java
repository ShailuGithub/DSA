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
public class ReverseNumber {

    public static void main(String[] args) {
        //reverse(1234,0);
        //System.out.println(sum);
        System.out.println(reverse1(1234, 0));
    }

    static int reverse1(int n, int sum) {
        if (n == 0) {
            return sum;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        return reverse1(n / 10, sum);
    }
    static int sum = 0;

    static void reverse(int n) {
        if (n == 0) {
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        reverse(n / 10);
    }
}
