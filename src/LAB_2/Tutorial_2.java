/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_2;

import java.util.Scanner;

public class Tutorial_2 {

    public static void main(String[] args) {
//        System.out.println("\"SDN\"-Software-defined networking");
//        System.out.println("\\t");
//        
//        int num = 1;
//        int num1 = 1;
//        
//        int ans = ++num;
//        int ans2 = num1++;
//        
//        System.out.println("ans  : " + ans);
//        System.out.println("ans2 : " + ans2);
//        System.out.println("num  : " + num);
//        System.out.println("num1 : " + num1);
        Scanner k = new Scanner(System.in);
        double d, p;
        System.out.print("Enter diameter: ");
        d = k.nextDouble();
        p = Math.PI * d;
        System.out.printf("The circumference of the circle is : %.3f\n", p);

    }
}
