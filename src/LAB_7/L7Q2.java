
package LAB_7;

import java.io.*;
import java.util.Scanner;
import java.net.URL;
import java.net.URLConnection;

public class L7Q2 {
    public static void main(String[] args) {
        try {
            URL u = new URL("https://fsktm.um.edu.my");
            URLConnection cnn = u.openConnection();
            InputStream stream = cnn.getInputStream();
            Scanner in = new Scanner(stream);

            PrintWriter outputStream = new PrintWriter(new FileOutputStream("C:\\Users\\USER\\Documents\\NetBeansProjects\\FOP_Demo\\src\\LAB_7\\index.htm"));
            while (in.hasNextLine()){
                System.out.println(in.nextLine());
                outputStream.println(in.nextLine());
            }

            in.close();
            outputStream.close();
        } catch (IOException e) {
            System.out.println("IO Error:" + e.getMessage());
        }
    }
}
