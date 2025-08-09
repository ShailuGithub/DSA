/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RecursionStrings;

/**
 *
 * @author SOFTWARE
 */
public class RemoveAll_a {

    public static void main(String[] args) {
        //skip("", "baccad");
        //System.out.println(Return("", "baccad"));
        //System.out.println(skipApple("bacapplecad"));
        System.out.println(skipAppNotApple("bacapplecad"));
    }

    static void skip(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        if (ch == 'a') {
            skip(p, up.substring(1));
        } else {
            skip(p + ch, up.substring(1));
        }
    }

    static String Return(String p, String up) {
        if (up.isEmpty()) {
            return p;
        }

        char ch = up.charAt(0);
        if (ch == 'a') {
            return Return(p, up.substring(1));
        } else {
            return Return(p + ch, up.substring(1));
        }
    }

    static String skipApple(String up) {
        if (up.isEmpty()) {
            return "";
        }

        if (up.startsWith("apple")) {
            return skipApple(up.substring(5));
        } else {
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }
    
     static String skipAppNotApple(String up) {
        if (up.isEmpty()) {
            return "";
        }

        if (up.startsWith("app") && !up.startsWith("apple")) {
            return skipAppNotApple(up.substring(3));
        } else {
            return up.charAt(0) + skipAppNotApple(up.substring(1));
        }
    }
}
