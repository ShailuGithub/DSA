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
public class lengthOfLastWord {

    public static void main(String[] args) {
        lengthOfLastWord sol = new lengthOfLastWord();
        String s = "Hello World";
        System.out.println("Length of last word: " + sol.lengthOfLastWord(s)); // Output: 5
        System.out.println("Last word: \"" + sol.getLastWord(s) + "\""); // Output: "World"
    }

    public String getLastWord(String s) {
        int i = s.length() - 1;

        // Skip trailing spaces
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // Mark the end of the last word
        int end = i;

        // Move to the beginning of the last word
        while (i >= 0 && s.charAt(i) != ' ') {
            i--;
        } 
        // Extract substring of the last word
        return s.substring(i + 1, end + 1);
    }

    public int lengthOfLastWord(String s) {
        int length = 0;
        int i = s.length() - 1;

        // Skip trailing spaces
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // Count length of the last word
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }
}
