/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ScannerPractice;

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
public class StoreLoginDetails2 {
    public static void main(String[] args) {
        
        try { 
            
            FileWriter fw = new FileWriter("data\\loginDetails2.txt", true);
            
            String name = JOptionPane.showInputDialog("Enter your name here (enter stop to stop)"); 
            int loginNo = 0; 
            
            while (!name.equalsIgnoreCase("STOP")) {
                
                loginNo++; 
                
                String password = JOptionPane.showInputDialog("Enter a password here."); 
                
                PrintWriter pw = new PrintWriter(fw);
                
                pw.print(name);
                pw.print("#");
                pw.println(password);
                pw.close();
                
                System.out.println("Name: " + name + "\nPassword: " + password);
                name = JOptionPane.showInputDialog("Enter your name here (enter stop to stop)");
            }
            System.out.println("Number of logins: " + loginNo);
            fw.close();
           
        } catch (IOException ex) {
            Logger.getLogger(StoreLoginDetails2.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("IO Exception error.");
        }
        
    }
}
