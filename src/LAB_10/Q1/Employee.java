/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_10.Q1;

public abstract class Employee {
    private String name;
    private String type;

    public Employee(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public abstract double getTotalSalary();

    @Override
    public String toString() {
        return "Name: " + name +
                "\nType: " + type +
                "\nTotal salary per month: " + getTotalSalary();
    }
}