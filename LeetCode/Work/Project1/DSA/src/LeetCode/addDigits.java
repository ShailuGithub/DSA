/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

/**
 *
 * @author SOFTWARE
 */
public class addDigits {
    public static int addDigits(int num) {
        return num == 0 ? 0 : 1 + (num - 1) % 9;
    }

    public static void main(String[] args) {
        // Example input
        int num = 38;
        // Call the function and print the result
        int result = addDigits(num);
        System.out.println("The result of addDigits(" + num + ") is: " + result);
    }
}
