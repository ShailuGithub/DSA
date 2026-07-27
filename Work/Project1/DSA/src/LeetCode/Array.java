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
public class Array {

    public static void main(String[] args) {
        //syntax
        //datatype[] variable_name=new datatype[size]
        Scanner in = new Scanner(System.in);
//        int[] arr = new int[5];
        //System.out.println(rollnos[0]); 

//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }
        //System.out.println(Arrays.toString(arr));
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));

        //Modify
        str[1] = "abc";
        System.out.println(Arrays.toString(str));
    }
}
