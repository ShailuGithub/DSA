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
public class FindTheDifference {
     public char findTheDifference(String s, String t) {
        char result = 0;

        for (char c : s.toCharArray()) {
            result ^= c;
        }

        for (char c : t.toCharArray()) {
            result ^= c;
        }

        return result;
    }

    public static void main(String[] args) {
        FindTheDifference sol = new FindTheDifference();

        String s = "abcd";
        String t = "abcde";

        System.out.println(sol.findTheDifference(s, t)); // Output: e
    }
}
