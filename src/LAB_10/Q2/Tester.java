/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_10.Q2;

public class Tester {
    public static void main(String[] args) {
        SubstitutionCipher plainToCipher = new SubstitutionCipher("C:\\Users\\USER\\Documents\\NetBeansProjects\\FOP_Demo\\src\\LAB_10\\Q2\\plainText.txt", "C:\\Users\\USER\\Documents\\NetBeansProjects\\FOP_Demo\\src\\LAB_10\\Q2\\cipherText.txt", 2);
        plainToCipher.plainToCipher();

        SubstitutionCipher cipherToPlain = new SubstitutionCipher("C:\\Users\\USER\\Documents\\NetBeansProjects\\FOP_Demo\\src\\LAB_10\\Q2\\cipherText.txt", "C:\\Users\\USER\\Documents\\NetBeansProjects\\FOP_Demo\\src\\LAB_10\\Q2\\decodePlainText.txt", 2);
        cipherToPlain.cipherToPlain();
    }
}