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
public class LargestNumber {

    public static void main(String[] args) {
        int[] arr = {10, 25, 5, 78, 30};
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println("Largest number is: " + largest);
    }

}
