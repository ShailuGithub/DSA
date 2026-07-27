/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaFundamentals;

import java.util.Scanner;

/**
 *
 * @author SOFTWARE
 */
public class LearnerManagementSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] Name = new String[10];
        int[] Age = new int[10];
        int[] XP = new int[10];

        int count = 0;

        boolean running = true;

        while (running) {
            System.out.println("===== Airtribe Learner Manager =====");
            System.out.println("1. Add Learner");
            System.out.println("2. Display All Learners");
            System.out.println("3. Calculate Average XP");
            System.out.println("4. Exit");
            System.out.println("Select: _");
            int UserInput = sc.nextInt();
            sc.nextLine();

            switch (UserInput) {
                case 1:
                    if (count > 10) {
                        System.out.println("✗ Maximum learner limit reached!");
                        break;
                    }
                    System.out.println("Enter Name :");
                    String name = sc.nextLine();

                    System.out.println("Enter Age :");
                    int age = sc.nextInt();

                    System.out.println("Enter Xp :");
                    int xp = sc.nextInt();
                    sc.nextLine();

                    if (age >= 18 && age <= 100) {
                        Name[count] = name;
                        Age[count] = age;
                        XP[count] = xp;
                        count++;
                        System.out.println("✓ Learner added successfully!");

                    } else {
                        System.out.println("✗ Invalid age. Age must be between 18 and 100. ");
                    }
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No learners added yet.");
                    } else {
                        System.out.println("=====Learner List=====");
                        for (int i = 0; i < count; i++) {
                            System.out.println("Name : " + Name[i] + "| Age : " + Age[i] + "| XP : " + XP[i]);
                        }
                    }
                    break;
                case 3:
                    if (count == 0) {
                        System.out.println("No learners added yet.");
                    } else {
                        double average = 0;
                        double sum = 0;
                        for (int i = 0; i < count; i++) {
                            sum += XP[i];
                        }
                        average = sum / count;
                        System.out.println("Average Learner is : " + average);
                    }
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please select between 1 and 4.");
            }
        }
        sc.close();
    }

}
