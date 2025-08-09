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
public class PowerOfTwo {

    public static void main(String[] args) {
        int n = 31;
        boolean ans = (n & (n - 1)) == 0;
        System.out.println(ans);
    }

}
