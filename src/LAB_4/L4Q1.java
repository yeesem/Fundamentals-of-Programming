/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_4;

import java.util.Scanner;
public class L4Q1 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter an Integer: ");
//        int num = scanner.nextInt();
//
//        System.out.print("The factors are: ");
//        for (int i = 1; i <= num / 2; i++)
//            if (num % i == 0)
//                System.out.print(i + ", ");
//        System.out.println(num);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an Integer: ");
        int num = scanner.nextInt();

        System.out.print("The factors are: ");
        String factors = "";
        for (int i = 1; i <= num; i++)
            if (num % i == 0) factors += i + ", ";
        System.out.println(factors.substring(0, factors.length() - 2));
    }
}
