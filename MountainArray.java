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
public class MountainArray {
 
    public static void main(String[] args) {
        
    }
    //https://leetcode.com/problems/peak-index-in-a-mountain-array/
    public int peakIndexInMountainArray(int[] arr) {
      int start=0;
      int end=arr.length-1;
      while(start<end)
      {
          int mid=start+(end-start)/2;
          if(arr[mid]>arr[mid+1])
          {
              //you are in descresing part of array
              end=mid;
          }
          else
          {
              //uor in ascending part of array
              start=mid+1;
          }
      }
      return start;
    }
}
