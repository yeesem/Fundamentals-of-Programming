/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_10.Q1;
public class ContractStaff extends Employee {
    private double totalSales;

    public ContractStaff(String name, double totalSales) {
        super(name, "Contract Staff");
        this.totalSales = totalSales;
    }

    @Override
    public double getTotalSalary() {
        return 500 + .5 * totalSales;
    }
}
