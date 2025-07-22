/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

/**
 *
 * @author SOFTWARE
 */
public class longestCommonPrefix {

    public static void main(String[] args) {
        String[] strs = {"flower", "flight", "flow"};
        String result = longestCommonPrefix(strs);
        if (result.isEmpty()) {
            System.out.println("There is no common prefix among the input strings.");
        } else {
            System.out.println("Longest Common Prefix: '" + result + "'");
        }
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while(strs[i].indexOf(prefix)!=0)
            {
                prefix=prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty())
                    return "";
            }
        }
        return prefix;
    }
}
