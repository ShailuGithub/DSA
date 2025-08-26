/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StackAndQueuesQuestions;

import java.util.Stack;

/**
 *
 * @author SOFTWARE
 */
//20
public class ValidParentheses {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (ch == ')') {
                    if (stack.isEmpty() || stack.pop() != '(') {
                        return false;
                    }
                }
                if (ch == '}') {
                    if (stack.isEmpty() || stack.pop() != '{') {
                        return false;
                    }
                }
                if (ch == ']') {
                    if (stack.isEmpty() || stack.pop() != '[') {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}
