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
public class PalindromeCheck {

    public static void main(String[] args) {
        String str = "shailesh";
        //String reversed = new StringBuilder(str).reverse().toString();

        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        if (!str.equals(reversed)) {
            System.out.println("Not a Palindrome");
        } else {
            System.out.println("Is a Palindrome");
        }

    }
}
