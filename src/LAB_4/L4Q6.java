/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_4;

import java.util.Random;

public class L4Q6 {
    public static void main(String[] args) {
        Random random = new Random();
        int num = Math.abs(random.nextInt());
        System.out.println(num);

        if (num == 0)
            System.out.println("Number of digits: 1");
        else {
            int length = 0;
            for (int n = num; n > 0; n /= 10) length++;
            System.out.println("Number of digits: " + length);
        }
//        Besides using division, multiplication also applicable        
//        if (num == 0)
//            System.out.println("Number of digits: 1");
//        else
//            System.out.println("Number of digits: " + (int) (Math.log10(num) + 1));
    }
}
