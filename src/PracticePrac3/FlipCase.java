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
public class FlipCase {
    public static void main(String[] args) {
        //initialise
        String input1 = JOptionPane.showInputDialog("Enter a sentence with uneven uppercase and lowercase letters. "); 
        String output = ""; 
        char currentLetter = input1.charAt(0); 
        
        
        //test
        for (int i = 0; i < input1.length(); i++) {
             //process
             currentLetter = input1.charAt(i); 
            //change
            if (Character.isUpperCase(currentLetter)) {
                output += ("" +currentLetter).toLowerCase(); 
            }
            
            if (Character.isLowerCase(currentLetter)) {
                output += ("" + currentLetter).toUpperCase(); 
            }
        }
        System.out.println(output);
    }
}
