/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loops;

/**
 *
 * @author shail
 */
public class CountNums {

    public static void main(String[] args) {
        int num = 23552;
        int count = 0;
        while (num > 0) {
            int rem = num % 10;
            if (rem == 5) {
                count++;
            }
            num = num / 10;
        }
        System.out.println(count);

        //Reverse
//        int num = 23597;
//
//        int result = 0;
//        while (num > 0) {
//            int rem = num % 10;
//            num/=10;
//            result = result * 10 + rem;
//
//        }
//        System.out.println(result);
    }
}
