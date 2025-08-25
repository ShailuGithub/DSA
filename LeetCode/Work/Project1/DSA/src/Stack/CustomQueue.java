/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

/**
 *
 * @author SOFTWARE
 */
public class CustomQueue {

    private int[] data;
    private static final int DEFAULT_SIZE = 10;
    int end = 0;

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return end == data.length;
    }

    public boolean isEmpty() {
        return end == 0;
    }

    public boolean insert(int item) {
        if (isFull()) {
            return false;
        }

        data[end++] = item;
        return true;
    }

    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is Empty");
        }
        int removed = data[0];

        //Shift the elements to left
        for (int i = 1; i < end; i++) {
            data[i - 1] = data[i];
        }
        end--;
        return removed;
    }

    public int front() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is Empty");
        }
        return data[0];
    }

    public void diaplay() {
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + "<- "); 
        }
        System.out.println("END");
    }
}
