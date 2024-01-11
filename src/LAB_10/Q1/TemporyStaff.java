/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_10.Q1;

class TemporaryStaff extends Employee {
    private int hours;

    public TemporaryStaff(String name, int hours) {
        super(name, "Temporary Staff");
        this.hours = hours;
    }

    @Override
    public double getTotalSalary() {
        return 15 * hours;
    }
}
