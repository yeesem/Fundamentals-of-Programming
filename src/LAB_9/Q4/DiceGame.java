/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_9.Q4;

public class DiceGame {
    public void start() {
        int totalScore1 = 0;
        int totalScore2 = 0;

        while (true) {
            totalScore1 = rollDice("Player 1", totalScore1);
            if (totalScore1 >= 100) break;
            totalScore2 = rollDice("Player 2", totalScore2);
            if (totalScore2 >= 100) break;
            System.out.println();
        }
        System.out.println((totalScore1 >= 100 ? "Player 1" : "Player 2") + " is the winner!");
    }

    // This method returns the total score after the player rolls the dice.
    protected int rollDice(String playerName, int totalScore) {
        return 0;
    }
}