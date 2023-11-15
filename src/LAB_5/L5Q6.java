/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_5;

import java.util.Scanner;

public class L5Q6 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of row of Pascal Triangle to generate: ");
        int N = scanner.nextInt();

        int[][] matrix = new int[N][N];
        for (int i = 0; i < N; i++) {
            matrix[i][0] = 1;
            for (int j = 1; j <= i; j++)
                matrix[i][j] = matrix[i - 1][j - 1] + matrix[i - 1][j];
        }

        System.out.printf("The Pascal Triangle with %d row(s)\n", N);
        for (int[] row : matrix) {
            for (int i : row)
                System.out.print(i + " ");
            System.out.println();
        }
    }
}
