/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_6;

import java.util.Random;
import java.util.Scanner;

public class L6Q5 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        while (true) {
            System.out.println("Enter negative number to quit.");
            int i = random.nextInt(13);
            int j = random.nextInt(13);
            System.out.printf("%d x %d = ", i, j);
            int k = scanner.nextInt();
            if (k < 0) break;
            if (isProduct(i, j, k)) score++;
        }
        System.out.println("Your Score is " + score);
    }

    public static boolean isProduct(int i, int j, int k) {
        return i * j == k;
    }
}
