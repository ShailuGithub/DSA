/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

/**
 *
 * @author SOFTWARE
 */
public class Performance {

    public static void main(String[] args) {
        String Series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            Series = Series + ch;
        }
        System.out.println(Series);
    }

}
