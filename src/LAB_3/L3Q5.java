/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_3;

import java.util.Scanner;

public class L3Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a, b, c, d, e, f: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        int f = scanner.nextInt();

        int det = a * d - b * c;
        if (det == 0)
            System.out.println("The equation has no solution");
        else {
            double x = 1.0 * (e * d - b * f) / det;
            double y = 1.0 * (a * f - e * c) / det;
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }
    }
}
