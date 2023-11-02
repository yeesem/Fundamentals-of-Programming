/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_3;

import java.util.Random;


public class L3Q2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int num = rand.nextInt(6);
        String word = switch(num){
            case 0 -> "zero";
            case 1 -> "one";
            case 2 -> "two";
            case 3 -> "three";
            case 4 -> "four";
            case 5 -> "five";
            default -> "error";
        };
        
        System.out.printf("%d is %s.\n",num,word);
    }
}
