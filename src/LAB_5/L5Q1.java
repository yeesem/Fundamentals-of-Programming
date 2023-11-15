/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_5;

import java.util.Random;
import java.util.Scanner;

public class L5Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N students: ");
        int N = scanner.nextInt();
        int[] scores = new int[N];

        Random random = new Random();
        for (int i = 0; i < N; i++)
            scores[i] = random.nextInt(101);

        int min = 100;
        int max = 0;
        int sum = 0;
        System.out.println("List of scores: ");
        for (int i = 0; i < N; i++) {
            int score = scores[i];
            min = Math.min(min, score);
            max = Math.max(max, score);
            sum += score;

            System.out.printf("%3d ", score);
            if ((i + 1) % 10 == 0) System.out.println();    //One row 10 scores
        }
        System.out.println();
        System.out.println("Highest score: " + max);
        System.out.println("Lowest score: " + min);
        System.out.printf("Average score: %.3f\n", 1.0 * sum / N);
    }
}
