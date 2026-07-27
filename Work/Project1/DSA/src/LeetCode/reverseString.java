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
public class reverseString {

    public static void main(String[] args) {
        char[] str = {'h', 'e', 'l', 'l', 'o'};
        reverse(str);
        System.out.println("Reversed string: " + new String(str));
    }

    static void reverse(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }

}
