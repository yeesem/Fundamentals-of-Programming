/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_3;

import java.util.Random;

public class L3Q4 {
    public static void main(String[] args) {
        Random rand = new Random();
        int dice;
        System.out.println("Round 1");
        int sum1 = dice = rand.nextInt(6) + 1;
        System.out.println("Player 1: " + dice);
        int sum2 = dice = rand.nextInt(6) + 1;
        System.out.println("Player 2: " + dice);
        
        System.out.println();
        
        System.out.println("Round 2");
        sum1 += dice = rand.nextInt(6) + 1;
        System.out.println("Player 1: " + dice);
        sum2 += dice = rand.nextInt(6) + 1;
        System.out.println("Player 2: " + dice);
        
        System.out.println();
        
        System.out.println("Player 1 Total Score: " + sum1);
        System.out.println("Player 2 Total Score: " + sum2);
        if(sum1 == sum2) System.out.println("Tie.");
        else System.out.println("Player " + (sum1 > sum2 ? 1 : 2) + " wins the game!");
    }
}
