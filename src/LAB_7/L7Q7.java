/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_7;

import java.util.Arrays;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.*;

public class L7Q7 {
    
     public static void main(String [] args){
        
         String data = null;
         String [] lineContent = new String[3];
         
         try{
         BufferedReader readProduct = new BufferedReader(new FileReader("C:/Users/USER/Documents/NetBeansProjects/LAB 7/Product.txt"));
         BufferedReader readOrder = new BufferedReader(new FileReader("C:/Users/USER/Documents/NetBeansProjects/LAB 7/Order.txt"));                           
         
         int i=0;
         data = readProduct.readLine();
         String [] id = new String[7];
         String [] ProductName = new String[7];
         double [] price = new double[7];
        
         while(data!=null){
             lineContent = data.split(",");
             id[i]=lineContent[0];
             ProductName[i]=lineContent[1];
             price[i]=Double.parseDouble(lineContent[2]);
             i++;
             data = readProduct.readLine();
         }
         
         data = readOrder.readLine();
         int j=0;
         String [] orderId = new String[5];
         String [] Id = new String[5];
         int [] quantity = new int[5];
         while(data!=null){
             lineContent = data.split(","); //Store array from data and / as terminator for each sub-array
             orderId[j]=lineContent[0];
             Id[j]=lineContent[1];
             quantity[j]=Integer.parseInt(lineContent[2]);  //Change String variable to int
             j++;
             data=readOrder.readLine();
         }
         
             System.out.printf("\n%-25s%-25s%-25s%-25s%-25s","Product ID","Product Name","Quantity","Price per Unit","Total");
             
             
             for(int k=0;k<5;k++){
                 System.out.printf("\n%-25s",Id[k]);
                 for(int m=0;m<7;m++){ 
                 if(id[m].equals(Id[k])){    
                 System.out.printf("%-25s%-25d%-25.2f%-25.2f",ProductName[m],quantity[k],price[m],(quantity[k]*price[m]));
                 break;
                 }
             }
             }
          readProduct.close();
          readOrder.close();   
        }        
        catch(FileNotFoundException e){System.out.println("File Not Found");}
        catch(IOException e){System.out.println("Error occurs while edting file");}
     }    
}

