/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_3;

import java.util.Scanner;

public class L3Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two integer number: ");
        int x = input.nextInt();
        int y = input.nextInt();
        System.out.println("Enter the operand: ");
        char op = input.next().charAt(0);
        
        System.out.printf("%d %c %d = ",x,op,y);
        
        switch(op){
            case '+' -> System.out.println(x + y);
            case '-' -> System.out.println(x - y);
            case '*' -> System.out.println(x * y);
            case '/' -> System.out.println(x / y);
            case '%' -> System.out.println(x % y);
        }
    }
}
