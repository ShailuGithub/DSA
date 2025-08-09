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
public class CountNoOfZeros {

    public static void main(String[] args) {
        System.out.println(Count(30200004, 0));
    }

    static int Count(int n, int count) {
        if (n == 0) {
            return count;
        }
        int rem = n % 10;
        if (rem == 0) {
            count++;
        }
        return Count(n / 10, count);

    }

}
