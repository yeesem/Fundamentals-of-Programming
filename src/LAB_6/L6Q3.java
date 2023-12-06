/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_6;

import java.util.Random;

public class L6Q3 {
     public static void main(String[] args) {
        int[] a = new int[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++)
            a[i] = random.nextInt(1000);

        // Before reverse
        for (int i : a)
            System.out.printf("%3d ", i);
        System.out.println();

        reverse(a);

        // After reverse
        for (int i : a)
            System.out.printf("%3d ", i);
        System.out.println();
    }

    public static void reverse(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int reverse = 0;
            for (int num = a[i]; num > 0; num /= 10)
                reverse = (10 * reverse) + (num % 10);
            a[i] = reverse;
        }
    }
    
}
