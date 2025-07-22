/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinarySearch;

/**
 *
 * @author SOFTWARE
 */
public class FirstOccurrenceInString {

    public static void main(String[] args) {
        FirstOccurrenceInString sol = new FirstOccurrenceInString();
        String haystack = "hello";
        String needle = "ll";
        int result = sol.strStr(haystack, needle);
        System.out.println("Index of first occurrence: " + result);
    }

    public int strStr(String haystack, String needle) {
        int hLen = haystack.length();
        int nLen = needle.length();

        if (nLen == 0) {
            return 0;
        }

        for (int i = 0; i <= hLen - nLen; i++) {
//            if (haystack.substring(i, i + nLen).equals(needle)) {
//                return i;
//            }
            if (haystack.substring(i, hLen - 1).equals(needle)) {
                return i;
            }
        }

        return -1;
    }
}
