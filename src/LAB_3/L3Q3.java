/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_3;

import java.util.Scanner;

public class L3Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the sales volume: ");
        double salesVolume = input.nextDouble(); 
        
        double commissionPercentage;
        
        if(salesVolume <= 100) commissionPercentage = 0.05;
        else if(salesVolume > 100 && salesVolume <= 500) commissionPercentage = 0.075;
        else if(salesVolume <= 1000) commissionPercentage = 0.1;
        else commissionPercentage = 0.125;
        
        System.out.printf("Commission: %.2f\n",commissionPercentage * salesVolume);
    }
}
