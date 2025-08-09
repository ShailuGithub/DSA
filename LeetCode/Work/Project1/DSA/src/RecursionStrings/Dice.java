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
public class Dice {

    public static void main(String[] args) {
        //dice("", 4);
        System.out.println(diceList("", 4).size());
        System.out.println(diceCount("", 4));
    }

    static void dice(String p, int target) {
        if (target == 0) {
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= 6 && i <= target; i++) {
            dice(p + i, target - i);
        }
    }

    static ArrayList<String> diceList(String p, int target) {
        if (target == 0) {
            ArrayList<String> strlist = new ArrayList<>();
            strlist.add(p);
            return strlist;
        }
        ArrayList<String> strlist = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target; i++) {
            strlist.addAll(diceList(p + i, target - i));
        }
        return strlist;
    }

    static int diceCount(String p, int target) {
        if (target == 0) {
            return 1;
        }
        int count = 0;
        for (int i = 1; i <= 6 && i <= target; i++) {
            count = count + diceCount(p + i, target - i);
        }
        return count;
    }
}
