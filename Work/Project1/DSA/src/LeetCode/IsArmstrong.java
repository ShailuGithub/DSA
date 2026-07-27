/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import static LeetCode.IsPrimeNumber.isPrime;
import java.util.Scanner;

/**
 *
 * @author SOFTWARE
 */
public class IsArmstrong {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      //  int n = in.nextInt();
       // Boolean ans = isArmstrong(n);
        
        
        for (int i = 100; i < 1000; i++) {
            
            if(isArmstrong(i))
            {
                System.out.println(i + " ");
            }
        }
    }

    static Boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum += rem*rem*rem;
            n = n / 10;
        } 
        return sum == original;
    }
}
