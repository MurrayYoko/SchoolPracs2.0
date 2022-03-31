/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ScannerPractice;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Murrayy
 */
public class UserDetails2 {
    public static void main(String[] args) {
        
        String details = JOptionPane.showInputDialog("Enter your name, age and surname (separated with spaces)"); 
        
        Scanner sc = new Scanner(details).useDelimiter(" "); 
        
        String firstName = sc.next(); 
        String lastName = sc.next(); 
        int age = sc.nextInt(); 
        
        sc.close(); 
        System.out.println("First name: " + firstName + "\nLast name: " + lastName + "\nAge: " + age);
        
        
    }
}
