/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_5;

import java.util.Random;

public class L5Q2 {
     public static void main(String[] args) {
        int[] nums = new int[10];
        
        //From 0 to 20 total 21 numbers
        boolean[] generated = new boolean[21];
        Random random = new Random();
        for (int i = 0; i < nums.length; i++) {
            while (true) {
                int number = random.nextInt(21);
                // Check if there exists duplicate of this number in the previous elements.
                if (generated[number]) continue;
                
                nums[i] = number;
                generated[number] = true;
                break;
            }
        }

        for (int num : nums)
            System.out.print(num + " ");
        System.out.println();
    }
}
