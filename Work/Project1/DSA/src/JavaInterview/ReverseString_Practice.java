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
public class ReverseString_Practice {

    public static void main(String[] args) {
        String Str = "SHAILESH";
//        String reversed = new StringBuilder(Str).reverse().toString();
//        System.out.println(reversed);

//        String reversed = "";
//        for (int i = Str.length() - 1; i >= 0; i--) {
//            reversed += Str.charAt(i);
//        }
//        System.out.println(reversed);
//        char[] arr = Str.toCharArray();
//
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
//        System.out.println(new String(arr));
        System.out.println(Reverse(Str));
    }

    public static String Reverse(String Str) {
        if (Str.isEmpty()) {
            return Str;
        }

        return Reverse(Str.substring(1)) + Str.charAt(0);
    }
}
