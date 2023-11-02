/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_3;

import java.util.Scanner;

public class L3Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of circle : ");
        int radius = input.nextInt();
        System.out.println("Enter the coordinate point (x,y): ");
        int x = input.nextInt();
        int y = input.nextInt();
        
        double distance = Math.sqrt(x*x + y*y);
        if(distance == radius)
            System.out.println("The point is on the circle");
        else
            System.out.println("The point is " + (distance < radius ? "inside":"outside") + " the circle.");
    }
}
