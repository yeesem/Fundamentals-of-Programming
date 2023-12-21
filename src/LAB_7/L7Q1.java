/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_7;

import java.io.*;
import java.util.Scanner;

public class L7Q1 {
    public static void main(String[] args) {
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("C:\\Users\\USER\\Documents\\NetBeansProjects\\FOP_Demo\\src\\LAB_7\\coursename.dat"));
            String[][] courses = {
                    {"WXES1116", "Programming I"},
                    {"WXES1115", "Data Structure"},
                    {"WXES1110", "Operating System"},
                    {"WXES1112", "Computing Mathematics I"}
            };
            for (String[] course : courses)
                for (String courseInfo : course)
                    outputStream.writeUTF(courseInfo);
            outputStream.close();
        } catch (IOException e) {
            System.out.println("Error in writing file.");
        }

        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter a course code: ");
        String courseCode = userInput.nextLine();

        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("C:\\Users\\USER\\Documents\\NetBeansProjects\\FOP_Demo\\src\\LAB_7\\coursename.dat"));
            try {
                while (true) {
                    String code = inputStream.readUTF();
                    String name = inputStream.readUTF();
                    if (code.equals(courseCode)) {
                        System.out.println("Course Name: " + name);
                        break;
                    }
                }
            } catch (EOFException e) {
                System.out.println("Course code is not found.");
            }
            inputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("File is not found.");
        } catch (IOException e) {
            System.out.println("Error in reading file.");
        }
    }
}

