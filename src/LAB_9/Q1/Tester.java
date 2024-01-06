/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_9.Q1;

public class Tester {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.setName("Shape");
        shape.setPerimeter(50);
        shape.setArea(100);
        System.out.println(shape);
        System.out.println();

        Rectangle rectangle = new Rectangle(8, 12);
        rectangle.setName("Rectangle");
        System.out.println(rectangle);
        System.out.println();

        Square square = new Square(10);
        square.setName("Square");
        System.out.println(square);
        System.out.println();

        Circle circle = new Circle(14);
        circle.setName("Circle");
        System.out.println(circle);
    }
}
