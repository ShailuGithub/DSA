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
public class Findunique {

    public static void main(String[] args) {
        int[] arr = {2, 3, 3, 4, 2, 6, 4};
        System.out.println(ans(arr));
    }

    static int ans(int[] arr) {
        int unique = 0;

        for (int n : arr) {
            unique ^= n;
        }
        return unique;
    }
}
