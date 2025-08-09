/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RecursionStrings;

import java.util.ArrayList;

/**
 *
 * @author SOFTWARE
 */
public class SubSeq {

    public static void main(String[] args) {
        //subseq("", "abc");
        //System.out.println(subseqinArray("", "abc"));
//        subseqascii("", "abc");
        System.out.println(subseqinArrayascii("", "abc"));
    }

    static void subseq(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseq(p, up.substring(1));
        subseq(p + ch, up.substring(1));
    }

    static ArrayList<String> subseqinArray(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> strlist = new ArrayList<>();
            strlist.add(p);
            return strlist;
        }

        char ch = up.charAt(0);
        ArrayList<String> left = subseqinArray(p + ch, up.substring(1));
        ArrayList<String> right = subseqinArray(p, up.substring(1));

        left.addAll(right);
        return left;
    }

    static void subseqascii(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseqascii(p + ch, up.substring(1));
        subseqascii(p, up.substring(1));
        subseqascii(p + (ch + 0), up.substring(1));
    }
    
     static ArrayList<String> subseqinArrayascii(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> strlist = new ArrayList<>();
            strlist.add(p);
            return strlist;
        }

        char ch = up.charAt(0);
        ArrayList<String> first = subseqinArrayascii(p + ch, up.substring(1));
        ArrayList<String> second = subseqinArrayascii(p, up.substring(1));
        ArrayList<String> third = subseqinArrayascii(p + (ch+0), up.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
