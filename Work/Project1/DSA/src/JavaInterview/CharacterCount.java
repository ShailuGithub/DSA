/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaInterview;

/**
 *
 * @author SOFTWARE
 */
public class CharacterCount {

    public static void main(String[] args) {
        String str = "programming";
        char ch = 'g';
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        System.out.println("Character '" + ch + "' occurs " + count + " times.");
    }
}
