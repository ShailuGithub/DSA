/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaFundamentals;

/**
 *
 * @author SOFTWARE
 */
public class Main {

    public static void main(String[] args) {
        FullTimeEmployee emp1 = new FullTimeEmployee("Shailesh", 20, 25000, 1000);
        PartTimeEmployee emp2 = new PartTimeEmployee("Rahul", 20, 15000, 250);

        Employee[] employees = {emp1, emp2};

        System.out.println("=== Polymorphism Demo ===\n");

        for (Employee emp : employees) {
            emp.displayInfo();
        }
        System.out.println("=== Method Overloading Demo ===\n");

        emp1.displayinfo(true);

        emp1.displayinfo(false);
    }

}
