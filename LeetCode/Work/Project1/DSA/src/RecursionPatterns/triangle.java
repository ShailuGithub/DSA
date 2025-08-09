/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RecursionPatterns;

import java.util.Arrays;

/**
 *
 * @author SOFTWARE
 */
public class triangle {

    public static void main(String[] args) {
        int row = 4;
        int col = 0;
        //pattern(row, col);
        //triangle(row, col);
        int[] arr = {4, 3, 2, 8, 1};
        //Bubble(arr, arr.length - 1, 0);
        //System.out.println(Arrays.toString(arr));
        Selection(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void pattern(int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            System.out.print("* ");
            pattern(row, col + 1);
        } else {
            System.out.println();
            pattern(row - 1, 0);
        }
    }

    static void triangle(int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            triangle(row, col + 1);
            System.out.print("* ");
        } else {
            triangle(row - 1, 0);
            System.out.println();
        }
    }

    static void Bubble(int[] arr, int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            if (arr[col] > arr[col + 1]) {
                //swap
                int temp = arr[col];
                arr[col] = arr[col + 1];
                arr[col + 1] = temp;
            }
            Bubble(arr, row, col + 1);
        } else {
            Bubble(arr, row - 1, 0);
        }
    }

    static void Selection(int[] arr, int row, int col, int max) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            if (arr[col] > arr[max]) {
                Selection(arr, row, col + 1, col);
            } else {
                Selection(arr, row, col + 1, max);
            }
        } else {
            int temp = arr[max];
            arr[max] = arr[row - 1];
            arr[row - 1] = temp;
            Selection(arr, row - 1, 0, 0);
        }
    }

}
