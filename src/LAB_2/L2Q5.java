/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_2;

import java.util.Random;

public class L2Q5 {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(10001);
        System.out.println("Number: " + num);

        // Use a, b, ... to denote digits of the number abcde.
        int a = num / 10000;
        num %= 10000;
        int b = num / 1000;
        num %= 1000;
        int c = num / 100;
        num %= 100;
        int d = num / 10;
        int e = num % 10;
        System.out.println("Sum of digits in the number: " + (a + b + c + d + e));
    }
}
