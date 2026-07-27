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
public class isIsomorphic {
     public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        // Maps to track the character mappings
        HashMap<Character, Character> mapS = new HashMap<>();
        HashMap<Character, Character> mapT = new HashMap<>();
        
        // Traverse both strings
        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            
            // If there's a mapping for charS in mapS but not for charT in mapT
            if (mapS.containsKey(charS) && mapS.get(charS) != charT) {
                return false;
            }
            if (mapT.containsKey(charT) && mapT.get(charT) != charS) {
                return false;
            }
            
            // Create the mapping if not already present
            mapS.put(charS, charT);
            mapT.put(charT, charS);
        }
        
        return true;
    }

    public static void main(String[] args) {
        isIsomorphic solution = new isIsomorphic();
        
        // Test case 1
        String s1 = "egg";
        String t1 = "add";
        System.out.println(solution.isIsomorphic(s1, t1)); // Output: true
        
        // Test case 2
        String s2 = "foo";
        String t2 = "bar";
        System.out.println(solution.isIsomorphic(s2, t2)); // Output: false
        
        // Test case 3
        String s3 = "paper";
        String t3 = "title";
        System.out.println(solution.isIsomorphic(s3, t3)); // Output: true
    }
}
