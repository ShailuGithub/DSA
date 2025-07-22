/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loops;

import java.util.Scanner;

/**
 *
 * @author shail
 */
public class NestedSwitch {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int EmpId = in.nextInt();
        String Department = in.next();

        switch (EmpId) {
            case 1:
                System.out.println("shailesh");
                break;
            case 2:
                System.out.println("rahul");
                break;
            case 3:
                System.out.println("Enter Number is 3");
                switch (Department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management");
                        break;

                }
            default:
                System.out.println("Enter Correct Emp ID");
        }
    }

}
