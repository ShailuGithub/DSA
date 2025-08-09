/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeRecursion;

/**
 *
 * @author SOFTWARE
 */
public class DigitProduct {

    public static void main(String[] args) {
        System.out.println(ans(1342));
    }

    static int ans(int n) {
        if (n % 10 == n) {
            return n;
        }
        return n % 10 * ans(n / 10);
    }

}
