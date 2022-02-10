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
public class ReadNames2 {
    public static void main(String[] args) {
        
        try {
            
            String filePath = "data//names.txt";
            File file = new File(filePath); 
            Scanner sc = new Scanner(file);
            
            while (sc.hasNext()) {
                
                String name = sc.next();
                String surname = sc.next();
                String init1 = "" + name.charAt(0); 
                
                System.out.println(init1 + surname);
               
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReadNames2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
