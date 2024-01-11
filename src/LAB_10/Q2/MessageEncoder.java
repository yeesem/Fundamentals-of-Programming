/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_10.Q2;

public interface MessageEncoder {
    String encode(String plainText);

    String decode(String cipherText);
}