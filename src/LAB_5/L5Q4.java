/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_5;

public class L5Q4 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 5, 7}, {3, 6, 9}, {5, 3, 8}};
        System.out.println("3 by 3 Matrix");
        
        //Print row and then col
        for (int[] row : matrix) {
            for (int i : row)
                System.out.print(i + " ");
            System.out.println();
        }

        System.out.println("After rotates 90 degrees clockwise");
        int[][] rotatedMatrix = new int[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                rotatedMatrix[i][j] = matrix[2 - j][i];

        for (int[] row : rotatedMatrix) {
            for (int i : row)
                System.out.print(i + " ");
            System.out.println();
        }
    }
}
