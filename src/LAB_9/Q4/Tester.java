/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_9.Q4;

public class Tester {
    public static void main(String[] args) {
        FirstDiceGame firstDiceGame = new FirstDiceGame();
        System.out.println("First Dice Game");
        firstDiceGame.start();
        System.out.println();

        SecondDiceGame secondDiceGame = new SecondDiceGame();
        System.out.println("Second Dice Game");
        secondDiceGame.start();
    }
}