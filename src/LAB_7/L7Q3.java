/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class L7Q3 {
    public static void main(String[] args) {
//        try {
//            Scanner inputStream = new Scanner(new FileInputStream("C:\\Users\\USER\\Documents\\NetBeansProjects\\FOP_Demo\\src\\LAB_7\\Q3.txt"));
//            PrintWriter outputStream = new PrintWriter(new FileOutputStream("C:\\Users\\USER\\Documents\\NetBeansProjects\\FOP_Demo\\src\\LAB_7\\reverse.txt"));
//
//            while (inputStream.hasNextLine()) {
//                String line = inputStream.nextLine();
//                String reverse = "";
//                for (int i = line.length() - 1; i >= 0; i--)
//                    reverse += line.charAt(i);
//                outputStream.println(reverse);
//            }
//
//            inputStream.close();
//            outputStream.close();
//        } catch (IOException e) {
//            System.out.println("Error in reading / writing file.");
//        }
 
         String line = null;
         
         try{
             BufferedReader initialFile = new BufferedReader(new FileReader("C:\\Users\\USER\\Documents\\NetBeansProjects\\FOP_Demo\\src\\LAB_7\\Q3.txt"));
             PrintWriter finalFile = new PrintWriter(new FileOutputStream("C:\\Users\\USER\\Documents\\NetBeansProjects\\FOP_Demo\\src\\LAB_7\\reverse.txt"));
             
             line = initialFile.readLine();
             
             while(line != null){
                 for(int i = line.length() - 1;i >= 0;i--){
                     finalFile.print(line.charAt(i));
                 }
                 finalFile.print("\n ");
                 line = initialFile.readLine();
             }
              
             initialFile.close();
             finalFile.close();
         }
         catch(FileNotFoundException e){System.out.println("File Not Found");}
         catch(IOException e){System.out.println("Error Occurs While Editing File");}
     }    

    }

