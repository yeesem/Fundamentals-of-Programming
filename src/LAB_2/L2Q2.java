/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_2;

import java.util.Scanner;

public class L2Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("The price of the car: ");
        double P = scanner.nextDouble();
        System.out.print("Down payment: ");
        double D = scanner.nextDouble();
        System.out.print("Interest Rate in %: ");
        double R = scanner.nextDouble();
        System.out.print("Loan duration in year: ");
        int Y = scanner.nextInt();

        double M = (P - D) * (1 + R * Y / 100) / (Y * 12);
        System.out.printf("Monthly Payment: %.2f\n", M);
    }
}
