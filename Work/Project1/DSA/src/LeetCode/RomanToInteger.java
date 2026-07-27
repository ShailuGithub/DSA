/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

import java.util.HashMap;

/**
 *
 * @author SOFTWARE
 */
public class RomanToInteger {

    public static void main(String[] args) {
        String roman = "MCMXCIV"; // 1994
        int result = romanToInt(roman);
        System.out.println("The integer value of " + roman + " is: " + result);
    }

    public static int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int total = 0;
        int prev = 0;

        // Process from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            int curr=map.get(s.charAt(i));
            
            if(curr<prev)
            {
                total-=curr;
            }
            else
            {
                total+=curr;
            }
            prev=curr;
        }

        return total;
    }
}
