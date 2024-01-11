/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_10.Q3;


public class Tester {
    public static void main(String[] args) {
        ShuffleCipher plainToCipher = new ShuffleCipher("C:\\Users\\USER\\Documents\\NetBeansProjects\\FOP_Demo\\src\\LAB_10\\Q2\\plainText.txt", "C:\\Users\\USER\\Documents\\NetBeansProjects\\FOP_Demo\\src\\LAB_10\\Q3\\shuffleCipherText.txt", 2);
        plainToCipher.plainToCipher();

        ShuffleCipher cipherToPlain = new ShuffleCipher("C:\\Users\\USER\\Documents\\NetBeansProjects\\FOP_Demo\\src\\LAB_10\\Q3\\shuffleCipherText.txt", "C:\\Users\\USER\\Documents\\NetBeansProjects\\FOP_Demo\\src\\LAB_10\\Q3\\shuffleDecodedText.txt", 2);
        cipherToPlain.cipherToPlain();
    }
}
