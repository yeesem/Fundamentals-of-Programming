/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_9.Q1;

public class Circle extends Shape {
    private double diameter;

    public Circle(double diameter) {
        this.diameter = diameter;
        computePerimeterAndArea();
    }

    public void computePerimeterAndArea() {
        setPerimeter(Math.PI * diameter);
        setArea(Math.PI * diameter * diameter / 4);
    }
}