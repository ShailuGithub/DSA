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
public class DigitProduct {
    
 public static void main(String[] args) {
        int n = 1342;
        System.out.println(Product(n));
    }

    static int Product(int n) {
        if (n %10== n) {
            return n;
        }
        return n % 10 * Product(n / 10);
    }
}
