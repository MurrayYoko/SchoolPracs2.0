/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ScannerClassAndTextFiles;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Murrayy
 */
public class UserDetails {
    public static void main(String[] args) {
        
        
    String details = JOptionPane.showInputDialog("Enter your name, surname and age in here (separated by spaces and in the instructed order.)"); 
    
    Scanner sc = new Scanner(details).useDelimiter(" "); 
    
        while (sc.hasNext()) {
            
            String firstName = sc.next();
            String surname = sc.next(); 
            int age = sc.nextInt(); 
            System.out.println("Name: " + firstName + "\nSurname: " + surname + "\nAge: " + age);
        }
    sc.close();
    }
}
