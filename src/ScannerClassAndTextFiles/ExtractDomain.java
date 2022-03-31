/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ScannerClassAndTextFiles;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Murrayy
 */
public class ExtractDomain {
    public static void main(String[] args) {
        
        File file = new File("data\\websites.txt"); 
        
        try {
            
            Scanner filesS = new Scanner(file); 
            int domainNo = 0; 
            
            while (filesS.hasNext()) {
                
                domainNo++; 
                String line = filesS.nextLine(); 
                
                Scanner lineSc = new Scanner(line).useDelimiter("[.]");
                
                lineSc.next(); 
                
                String domain = lineSc.next();
                
                System.out.println("Domain " + domainNo + ": " + domain);
                
                lineSc.close();
            }
            filesS.close();
            
            System.out.println("Number of websites processed: " + domainNo);
            
        } catch (Exception e) {
            System.out.println("There was an Error. ");
        }
    }
}
