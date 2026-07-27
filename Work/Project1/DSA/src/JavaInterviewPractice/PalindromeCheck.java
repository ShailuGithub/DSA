/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaInterviewPractice;

/**
 *
 * @author SOFTWARE
 */
public class PalindromeCheck {

    public static void main(String[] args) {
        String str = "shailesh";
        String reversed = new StringBuilder(str).reverse().toString();
        if (str.equals(reversed)) {
            System.out.println("Is Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

    }
}
