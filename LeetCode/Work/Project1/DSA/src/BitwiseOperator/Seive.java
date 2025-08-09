/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BitwiseOperator;

/**
 *
 * @author SOFTWARE
 */
public class Seive {

    public static void main(String[] args) {
        int n = 40;
        boolean[] primes = new boolean[n + 1];
        System.out.println(primes[0]);
        seive(n, primes);
    }

    static void seive(int n, boolean[] primes) {
        for (int i = 2; i * i <= n; i++) {
            if (!primes[i]) {
                for (int j = i * 2; j <= n; j+=i) {
                    primes[j] = true;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if(!primes[i])
            {
                System.out.print(i+" ");
            }
        }
    }
}
