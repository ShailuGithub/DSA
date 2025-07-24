/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

import java.util.ArrayList;

/**
 *
 * @author SOFTWARE
 */
public class Operators {

    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println('a' + 3);
        System.out.println((char) ('a' + 3));
        System.out.println("a" + 1);
        System.out.println("Shailesh" + new ArrayList<>());
        System.out.println("Shailesh" + new Integer(56));
        //System.out.println( new Integer(56)+ new ArrayList<>());
        System.out.println(new Integer(56) + "" + new ArrayList<>());
    }

}
