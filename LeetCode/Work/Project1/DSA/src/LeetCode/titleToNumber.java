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
public class titleToNumber {
    public static int titleToNumber(String columnTitle) {
        int result = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            char ch = columnTitle.charAt(i);
            int value = ch - 'A' + 1;  // 'A' -> 1, ..., 'Z' -> 26
            result = result * 26 + value;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(titleToNumber("A"));    // 1
        System.out.println(titleToNumber("Z"));    // 26
        System.out.println(titleToNumber("AA"));   // 27
        System.out.println(titleToNumber("AB"));   // 28
        System.out.println(titleToNumber("ZY"));   // 701
    }
}
