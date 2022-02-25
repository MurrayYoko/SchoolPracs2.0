/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ScannerClassAndTextFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Murrayy
 */
public class Delimiters {

    public static void main(String[] args) {

        try {

            String filePath = "data//positions.txt";
            File file = new File(filePath);
            Scanner sc = new Scanner(file); 

            while (sc.hasNext()) {
                String line = sc.next(); 
                Scanner lnScanner = new Scanner(line).useDelimiter("#"); 
                String firstName = sc.next();
                String lastName = sc.next();
                String position = sc.next();
                int matchNumber = sc.nextInt();
                System.out.println("Name: " + firstName + "\n" + "Surname: " + lastName + "\n" + "Position: " + position + "\n" + "Match number: " + matchNumber);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Delimiters.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
