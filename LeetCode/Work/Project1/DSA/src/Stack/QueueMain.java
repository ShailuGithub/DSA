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
public class QueueMain {

    public static void main(String[] args) throws Exception {
//        CustomQueue queue = new CustomQueue(5);
//        queue.insert(3);
//        queue.insert(6);
//        queue.insert(5);
//        queue.insert(19);
//        queue.insert(1);
//        queue.diaplay();
//        System.out.println(queue.remove());
//        queue.diaplay();

        CircularQueue queue = new CircularQueue(5);
        queue.insert(3);
        queue.insert(6);
        queue.insert(5);
        queue.insert(19);
        queue.insert(1);
        queue.diaplay();
        System.out.println(queue.remove());
        queue.insert(133);
        queue.diaplay();
        System.out.println(queue.remove());
         queue.insert(99);
        queue.diaplay();
    }

}
