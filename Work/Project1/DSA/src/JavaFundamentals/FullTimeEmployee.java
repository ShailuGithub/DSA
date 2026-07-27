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
public class FullTimeEmployee extends Employee {

    private double bonus;

    public FullTimeEmployee(String name, int id, double basesalary, double bonus) {
        super(name, id, basesalary);
        this.bonus = bonus;
    }

    @Override
    public double calculatePay() {
        return getBasesalary() + bonus;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Base Salary: " + getBasesalary());
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Pay: " + calculatePay());
        System.out.println();
    }

    public void displayinfo(Boolean showbonus) {
        super.displayInfo();
        System.out.println("Base Salary: " + getBasesalary());
        if (showbonus) {
            System.out.println("Bonus: " + bonus);
        }
        System.out.println("Total Pay: " + calculatePay());
        System.out.println();
    }

}
