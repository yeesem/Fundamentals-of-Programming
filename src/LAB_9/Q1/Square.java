/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_9.Q1;

public class Square extends Shape {
    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
        computePerimeterAndArea();
    }

    public void computePerimeterAndArea() {
        setPerimeter(4 * sideLength);
        setArea(sideLength * sideLength);
    }
}