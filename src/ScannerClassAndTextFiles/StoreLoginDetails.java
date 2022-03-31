/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ScannerClassAndTextFiles;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Murrayy
 */
public class StoreLoginDetails {
    public static void main(String[] args) {
        
        String filePath = "data\\logindetails.txt"; 
        
        try { 
            
            FileWriter fw = new FileWriter(filePath,true);
            
            int loginNo = 0; 
            String name = JOptionPane.showInputDialog("Enter a name (enter stop to stop)"); 
            
            
            while (name.equalsIgnoreCase("STOP") == false) {
                
                loginNo++;
                
                String password = JOptionPane.showInputDialog("Enter a password here."); 
                PrintWriter pw = new PrintWriter(fw); 
                
                pw.print(name);
                pw.print("#");
                pw.println(password);
                pw.close();
                
                name = JOptionPane.showInputDialog("Enter a name (enter stop to stop)");
            }
            System.out.println("Number of logins: " + loginNo);
            
        } catch (IOException ex) {
            Logger.getLogger(StoreLoginDetails.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("There was an IO Exception.");
        }
        
    }
}
