/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_5;

import java.util.Random;

public class L5Q3 {
     public static void main(String[] args) {
        
        int N = 20;
        //Scanner input = new Scanner(System.in);
        //N = input.nextInt();
        
        //Convert Integer to String and return its length
        int maxLength = String.valueOf(N).length();

        Random random = new Random();
        int[][] workHours = new int[N][7];
        for (int i = 0; i < N; i++)
            for (int j = 0; j < 7; j++)
                workHours[i][j] = random.nextInt(8) + 1;


        //maxLength indicates the maximum length of indexing or numbering
        //+2 is the spaces for '.' and a space before print the working hour
        System.out.print(" ".repeat(maxLength + 2));
        System.out.println("S M T W T F S Total");
        for (int i = 0; i < N; i++) {
            //"%" + maxLength + "d. "
            //%         - formatting systax
            //maxLength - spaces allocation
            //d         - Integer (Print indexing)
            System.out.printf("%" + maxLength + "d. ", i + 1);
            int totalHours = 0;
            for (int j = 0; j < 7; j++) {
                int hours = workHours[i][j];
                System.out.print(hours + " ");
                totalHours += hours;
            }
            System.out.printf("%5d\n", totalHours);
        }
    }
    
}
