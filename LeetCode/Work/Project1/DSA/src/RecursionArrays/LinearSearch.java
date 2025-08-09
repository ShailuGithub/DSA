/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RecursionArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author SOFTWARE
 */
public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 4, 4, 5};
        int target = 4;
//        System.out.println(Find(arr, target, 0));
//        System.out.println(FindIndex(arr, target, 0));
//        System.out.println(FindByLastIndex(arr, target, arr.length - 1));
//        FindIndexArrayList(arr, target, 0);
//        System.out.println(list);
        //System.out.println(FindIndexArrayListAddInParameter(arr, target, 0, new ArrayList<Integer>()));
        System.out.println(FindIndexWithoutParameterArrayList(arr, target, 0));
    }

    static boolean Find(int[] arr, int target, int index) {
        if (index == arr.length - 1) {
            return false;
        }

        return arr[index] == target || Find(arr, target, index + 1);

    }

    static int FindIndex(int[] arr, int target, int index) {
        if (index == arr.length - 1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return FindIndex(arr, target, index + 1);
        }
    }

    static int FindByLastIndex(int[] arr, int target, int index) {
        if (index == - 1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return FindByLastIndex(arr, target, index - 1);
        }
    }
    static ArrayList<Integer> list = new ArrayList<>();

    static void FindIndexArrayList(int[] arr, int target, int index) {
        if (index == arr.length - 1) {
            return;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        FindIndexArrayList(arr, target, index + 1);

    }

    static ArrayList<Integer> FindIndexArrayListAddInParameter(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return FindIndexArrayListAddInParameter(arr, target, index + 1, list);

    }

    static ArrayList<Integer> FindIndexWithoutParameterArrayList(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length) {
            return list;
        }

        if (arr[index] == target) {
            list.add(index);
        }

        list.addAll(FindIndexWithoutParameterArrayList(arr, target, index + 1));
        return list;
    }
}
