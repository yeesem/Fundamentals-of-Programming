/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_4;

import java.util.Random;

public class L4Q8 {
    public static void main(String[] args) {
        final int MAX = 101;
        int n;
        Random g = new Random();
        n = g.nextInt(MAX);
        System.out.println("The first " + n + " prime number");
        
        for (int i = 1, num = 2; i <= n; num += 1) { 
                                                    
            if (num % 2 == 1) {  
                for (int d = 3; d <= num; d += 2) {
                    if (num == d) {
                        i++;
                        System.out.print(num + ", ");
                    } else if (num % d == 0) {
                        break;
                    }
                }
            } else if (num == 2) {
                System.out.print(num + ", ");
                i++;
            }
        }
    }
}
