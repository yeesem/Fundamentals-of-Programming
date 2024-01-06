/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_9.Q4;

import java.util.Random;

public class FirstDiceGame extends DiceGame {
    private Random random = new Random();

    @Override
    public int rollDice(String playerName, int totalScore) {
        int dice1;
        int dice2;
        do {
            dice1 = random.nextInt(6) + 1;
            dice2 = random.nextInt(6) + 1;
            System.out.println(playerName + " Dice 1: " + dice1 + " Dice 2: " + dice2);
            totalScore += dice1 + dice2;
            if (totalScore >= 100) break;
        } while (dice1 == dice2);
        System.out.println(playerName + " Total Score: " + totalScore);
        return totalScore;
    }
}