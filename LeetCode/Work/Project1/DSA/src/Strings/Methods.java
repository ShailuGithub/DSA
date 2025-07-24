/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

import java.util.Arrays;

/**
 *
 * @author SOFTWARE
 */
public class Methods {
    public static void main(String[] args) {
        String name="shailesh kumar hello world";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name.indexOf('a')); 
        System.out.println(Arrays.toString(name.split(" ")));
    }
    
}
