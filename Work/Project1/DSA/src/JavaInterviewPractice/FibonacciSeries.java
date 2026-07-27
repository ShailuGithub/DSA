/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaInterviewPractice;

/**
 *
 * @author SOFTWARE
 */
public class FibonacciSeries {

    public static void main(String[] args) {
        int n = 10;
        int f = 0, s = 1;

        System.out.print("Fibonacci Series :" + f + " " + s);

        for (int i = 3; i < n; i++) {
            int next = f + s;
            System.out.print(" " + next);
            f = s;
            s = next;
        }
    }
}
