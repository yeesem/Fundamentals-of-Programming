/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_4;

import java.util.Scanner;

public class L4Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();
        System.out.print("Enter the first day of the year: ");
        int day = scanner.nextInt();

        // If it's a leap year, add a day.
        if (year % 400 == 0 || year % 100 != 0 && year % 4 == 0) day++;
        
        //120 total days from JAN tp APR
        day = (day + 120) % 7;

        System.out.println();
        System.out.println("May");
        System.out.println("  S  M  T  W  T  F  S");
        System.out.print(" ".repeat(3 * day));//Times 3 for spaces (formating)
        for (int d = 1; d <= 31; day++, d++) {
            System.out.printf("%3d", d);
            if (day % 7 == 6) System.out.println();
        }
        System.out.println();

        //61 total days from June and July
        day = (day + 61) % 7;
        System.out.println();
        System.out.println("August");
        System.out.println("  S  M  T  W  T  F  S");
        System.out.print(" ".repeat(3 * day));
        for (int d = 1; d <= 31; day++, d++) {
            System.out.printf("%3d", d);
            if (day % 7 == 6) System.out.println();
        }
        System.out.println();
    }
}
