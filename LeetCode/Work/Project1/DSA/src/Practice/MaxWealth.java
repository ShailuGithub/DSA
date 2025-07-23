/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;

/**
 *
 * @author SOFTWARE
 */
public class MaxWealth {

    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {10, 20, 30},
            {100, 50}
        };
        System.out.println(maximumWealth(arr));
    }

    static int maximumWealth(int[][] arr) {
        int maxwealth = 0;
        for (int row = 0; row < arr.length; row++) {
            int sum = 0;
            for (int col = 0; col < arr[row].length; col++) {
                sum += arr[row][col];
            }
           
            if (sum > maxwealth) {
                maxwealth = sum;
            }
        }
        return maxwealth;
    }

//    static int maximumWealth(int[][] Wealth) {
//        int ans = 0;
//
//        for (int row = 0; row < Wealth.length; row++) {
//            int sum = 0;
//            for (int col = 0; col < Wealth[row].length; col++) {
//                sum += Wealth[row][col];
//            }
//            if (sum > ans) {
//                ans = sum;
//            }
//        }
//        return ans;
//    }
}
