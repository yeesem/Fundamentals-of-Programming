/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class L7Q4 {
     public static void main(String[] args) {
        int charNum = 0;
        int wordNum = 0;
        int lineNum = 0;

        try {
            BufferedReader inputStream = new BufferedReader(new FileReader("C:\\Users\\USER\\Documents\\NetBeansProjects\\FOP_Demo\\src\\LAB_7\\reverse.txt"));
            String line = "";
            //String line = inputStream.readLine();
            while ((line = inputStream.readLine())!=null) {
                charNum += line.length();
                wordNum += line.split(" ").length;
                lineNum++;
                //line = inputStream.readLine();
            }
            inputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("File was not found.");
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Number of characters: " + charNum);
        System.out.println("Number of words: " + wordNum);
        System.out.println("Number of lines: " + lineNum);
    }
}
