/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class L7Q5 {
    public static void main(String[] args) {
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("C:\\Users\\USER\\Documents\\NetBeansProjects\\FOP_Demo\\src\\LAB_7\\person.dat"));
            int N = inputStream.readInt();

            String[] name = new String[N];
            int[] age = new int[N];
            char[] gender = new char[N];

            for (int i = 0; i < N; i++) {
                name[i] = inputStream.readUTF();
                age[i] = inputStream.readInt();
                gender[i] = inputStream.readChar();
            }

            for (int pass = 1; pass < N; pass++)
                for (int i = 0; i < N - pass; i++)
                    if (name[i].compareTo(name[i + 1]) > 0) {
                        String nameTemp = name[i];
                        name[i] = name[i + 1];
                        name[i + 1] = nameTemp;

                        int ageTemp = age[i];
                        age[i] = age[i + 1];
                        age[i + 1] = ageTemp;

                        char genderTemp = gender[i];
                        gender[i] = gender[i + 1];
                        gender[i + 1] = genderTemp;
                    }

            for (int i = 0; i < N; i++)
                System.out.printf("%s %d %c\n", name[i], age[i], gender[i]);
        } catch (FileNotFoundException e) {
            System.out.println("File was not found.");
        } catch (IOException e) {
            System.out.println("Error in file reading.");
        }
    }
}
