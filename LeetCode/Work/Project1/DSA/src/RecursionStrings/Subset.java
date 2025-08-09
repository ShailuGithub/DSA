/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RecursionStrings;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SOFTWARE
 */
public class Subset {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> ans = subset(arr);
        for (List<Integer> list : ans) {
            System.out.println(list);
        }
    }

    static List<List<Integer>> subset(int[] arr) {
        List<List<Integer>> outerlist = new ArrayList<>();

        outerlist.add(new ArrayList<Integer>());
        for (int num : arr) {
            int n = outerlist.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outerlist.get(i));
                internal.add(num);
                outerlist.add(internal);
            }
        }
        return outerlist;
    }
}
