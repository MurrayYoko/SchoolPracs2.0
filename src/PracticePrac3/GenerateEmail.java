/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticePrac3;

import javax.swing.JOptionPane;

/**
 *
 * @author Murrayy
 */
public class GenerateEmail {
    public static void main(String[] args) {
        //initialise
        String name = JOptionPane.showInputDialog("Enter your first and last name here."); 
        String firstName = ""; 
        String lastName = ""; 
        char currentLetter = name.charAt(0); 
       
        //test
        for (int i = 0; i < name.length(); i++) {
            currentLetter = name.charAt(i); 
            
        }
        
    }
}
