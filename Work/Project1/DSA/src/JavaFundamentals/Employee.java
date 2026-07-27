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
public class Employee {

    private String name;
    private int id;
    private double basesalary;

    public Employee(String name, int id, double basesalary) {
        this.name = name;
        this.id = id;
        this.basesalary = basesalary;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getBasesalary() {
        return basesalary;
    }

    public double calculatePay() {
        return basesalary;
    }

    public void displayInfo() {
        System.out.println("Name : " + name);
        System.out.println("ID : " + id);
        System.out.println("Calculate Pay : " + calculatePay());
    }

}
