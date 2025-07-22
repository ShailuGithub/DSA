/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.Stack;

/**
 *
 * @author SOFTWARE
 */
public class BracketValidator {
     public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            // Push opening brackets to the stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } 
            // Check matching for closing brackets
            else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) return false; // no matching opening
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // If stack is empty, all brackets matched properly
        return stack.isEmpty();
    }

    // Example usage
    public static void main(String[] args) {
        String input = "{[()]}";
        System.out.println("Is valid: " + isValid(input));
    }
}
