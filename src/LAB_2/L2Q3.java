/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_2;

import java.util.Random;
public class L2Q3 {
     public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(41) + 10;
        int y = random.nextInt(41) + 10;
        int z = random.nextInt(41) + 10;

        System.out.printf("The three numbers: %d, %d, %d\n", x, y, z);
        System.out.printf("The sum of the numbers: %d\n", x + y + z);
        System.out.printf("The average: %.2f\n", (x + y + z) / 3.0);
    }
}
