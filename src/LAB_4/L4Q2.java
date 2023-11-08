/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_4;

import java.util.Scanner;

public class L4Q2 {
    public static void main(String[] args) {
        int n, sum = 0;
        Scanner k = new Scanner(System.in);
        System.out.print("Enter a number n : ");
        n = k.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                sum += j;
            }
        }
        System.out.println("The sum of the series is " + sum);
    }
}
