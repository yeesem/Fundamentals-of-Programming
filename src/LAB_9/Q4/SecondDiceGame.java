/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_9.Q4;

import java.util.Random;

public class SecondDiceGame extends DiceGame {
    Random random = new Random();

    @Override
    public int rollDice(String playerName, int totalScore) {
        int dice1 = random.nextInt(6) + 1;
        System.out.println(playerName + " Dice: " + dice1);
        if (dice1 != 6) {
            if (totalScore + dice1 <= 100)
                totalScore += dice1;
        } else {
            int dice2 = random.nextInt(6) + 1;
            System.out.println(playerName + " Dice: " + dice2);
            if (dice2 != 6) {
                if (totalScore + dice1 <= 100) {
                    totalScore += dice1;
                    if (totalScore + dice2 <= 100)
                        totalScore += dice2;
                }
            }
        }
        System.out.println(playerName + " Total Score: " + totalScore);
        return totalScore;
    }
}