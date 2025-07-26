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
public class NumberExamplerecursion {
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n)
    {
        if(n==5)
        {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n+1);
    }
}
