/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author SOFTWARE
 */
public class MultiDimension {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
//        int[][] arr=new int[3][];
//        
//        int[][] arr2D={
//            {1,2,3},//0th index
//            {4,5},//1st index
//            {6,7,8,9}//2nd index -> arr2D[2]={6,7,8,9} and arr2D[2][0] is 6
//        }; 
        
        int [][] arr=new int[3][3];
        System.out.println(arr.length);
        
        //input
        for (int row = 0; row < arr.length; row++) {
            //for each col in a row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col]=in.nextInt();
            }
            
        }
        
        //Output
//        for (int row = 0; row < arr.length; row++) {
//            //for each col in a row
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] +" ");
//            }
//            System.out.println();
//        }
        
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }
    }
    
}
