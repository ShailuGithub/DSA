/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaInterview;

/**
 *
 * @author SOFTWARE
 */
public class FactorialofNumber {

    public static void main(String[] args) {
        int num = 5;
        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println("Factorial: " + fact);
    }
}
