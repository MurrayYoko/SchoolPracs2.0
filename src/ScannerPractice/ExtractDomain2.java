/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ScannerPractice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Murrayy
 */
public class ExtractDomain2 {
    public static void main(String[] args) {
        
        File file = new File("data\\websites.txt"); 
        
        try { 
            
            Scanner fileSc = new Scanner(file);
            int domainNo = 0; 
            
            while (fileSc.hasNext()) {
                domainNo++;
                
                String line = fileSc.next(); 
                Scanner lineSc = new Scanner(line).useDelimiter("[.]"); 
                
                lineSc.next(); 
                
                String domain = lineSc.next(); 
                
                lineSc.close();
                System.out.println("Domain " + domainNo + ": " + domain + "\nWebsites Processed: " + domainNo);
                
            }
            
            fileSc.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ExtractDomain2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
