/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Scanners_Writers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Murrayy
 */
public class BaitManager {
    
    private static String filePath = "data\\bait.txt";
    
    public static void printHello() {
        System.out.println("Hello");
    }
    
    
    public static String getBait() {
        String output = "";
        try {
            
            
            File f = new File (filePath);
            Scanner filesc = new Scanner(f);
            
            while (filesc.hasNextLine()){
                String line = filesc.nextLine(); 
                Scanner lineSc = new Scanner(line).useDelimiter("#");
                
                //START CODE HERE
                String type = lineSc.next();
                String lure = lineSc.next();
                
                output += "LURE TYPE: " + type + "  LURE " + lure + "\n";
                
                //END CODE HERE
                
                lineSc.close();
            }
            filesc.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BaitManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return output; 
    }
    
}
