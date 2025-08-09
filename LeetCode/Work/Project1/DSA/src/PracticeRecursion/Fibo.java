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
public class Fibo {

    public static void main(String[] args) {
        //0,1,2,3,4,5,6,7
        //0,1,1,2,3,5,8,13
        System.out.println(fibo(4));
    }

    static int fibo(int n) {
        if (n < 2) {
            return n;
        }

        return fibo(n - 1) + fibo(n - 2);
    }
}
