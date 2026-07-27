/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaInterview;

/**
 *
 * @author SOFTWARE
 */
public class ReverseString {

    public static void main(String[] args) {

        //1. Using StringBuilder (Easiest Way)
        String str = "Shailesh";
//        String reversed = new StringBuilder(str).reverse().toString();
//        System.out.println(reversed);

        //2. Using Loop (Without Inbuilt Method – Interview Favorite)
//        String reversed = "";
//
//        for (int i = str.length() - 1; i >= 0; i--) {
//            reversed += str.charAt(i);
//        }
//        System.out.println("Reversed: " + reversed);
//        3. Using Character Array
//        char[] arr = str.toCharArray();
//        int left = 0;
//        int right = arr.length - 1;
//
//        while (left < right) {
//            char temp = arr[left];
//            arr[left] = arr[right];
//            arr[right] = temp;
//            left++;
//            right--;
//        }
//        System.out.println("Reversed: " + new String(arr));
//        4. Using Recursion
        System.out.println(reverse(str));
    }

    public static String reverse(String str) {
        if (str.isEmpty()) {
            return str;
        }

        return reverse(str.substring(1)) + str.charAt(0);
    }
}
