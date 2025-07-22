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
public class ArrayMax {

    public static void main(String[] args) {
        int[] arr = {1, 33, 23, 9, 18};
         //System.out.println(max(arr));
        System.out.println(maxRange(arr, 0, 2)); 
    }

//    static int max(int[] arr) {
//        int maxval = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            if(arr[i]>maxval)
//            {
//                maxval=arr[i];
//            }
//        }
//
//        return maxval;
//    }

//      static int max(int[] arr) { 
//          int maxval=arr[0];
//          for (int i = 1; i < arr.length; i++) {                
//               if(arr[i]>maxval )
//                   maxval=arr[i];
//          }
//          return maxval;
//    }
    
    static int maxRange(int[] arr,int start,int end)
    {
        int maxval=arr[0];
        for (int i = start; i <= end; i++) {
            if(arr[i]>maxval)
            {
                maxval=arr[i];
            }
        }
        return maxval;
    }
    
//    static int maxRange(int[] arr, int start, int end) {
//        int maxval = arr[0];
//        for (int i = start; i <= end; i++) {
//            if (arr[i] > maxval) {
//                maxval = arr[i];
//            }
//        }
//        return maxval;
//    }
}
