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
public class minAddToMakeValid {

    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if(ch==')')
            {
                if(!stack.isEmpty() && stack.peek()=='(')
                {
                    stack.pop();
                }
                else
                {
                    stack.push(ch);
                }
            }
            else
            {
                  stack.push(ch);
            }
        }
        return stack.size();
    }
}
