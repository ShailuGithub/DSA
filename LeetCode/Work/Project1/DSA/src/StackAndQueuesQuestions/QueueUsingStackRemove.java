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
public class QueueUsingStackRemove {

    private Stack<Integer> first;
    private Stack<Integer> second;

    public QueueUsingStackRemove() {
        first = new Stack<>();
        second = new Stack<>();
    }

    public void add(int item) throws Exception {
        while (!first.empty()) {
            second.push(first.pop());
        }
        first.push(item);
        while (!second.empty()) {
            first.push(second.pop());
        }
    }

    public int remove() throws Exception {
        return first.pop();
    }

    public int peek() throws Exception {
        return first.peek();
    }

    public boolean isEmpty() {
        return first.empty();
    }
}
