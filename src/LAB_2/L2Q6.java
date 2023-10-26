/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_2;

import java.util.Scanner;

public class L2Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount of water in gram: ");
        double amount = scanner.nextDouble() / 1000;
        System.out.print("Enter the initial temperature in Fahrenheit: ");
        double initialTemp = (scanner.nextDouble() - 32) / 1.8; // Convert to Celsius
        System.out.print("Enter the final temperature in Fahrenheit: ");
        double finalTemp = (scanner.nextDouble() - 32) / 1.8;   // Convert to Celsius

        double energy = amount * (finalTemp - initialTemp) * 4184;
        System.out.printf("The energy needed is %e", energy);
    }
   
}
