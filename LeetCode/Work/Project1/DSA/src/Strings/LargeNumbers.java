/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

import java.math.BigInteger;

/**
 *
 * @author SOFTWARE
 */
public class LargeNumbers {

    public static void main(String[] args) {
        int a = 30;
        int b = 67;

        BigInteger A = BigInteger.valueOf(5);
        BigInteger B = BigInteger.valueOf(6);
        BigInteger C = new BigInteger("3423545");

        //constants
        BigInteger D = BigInteger.TEN;

        //addition
        BigInteger s = A.add(B);
        System.out.println(s);
    }

}
