/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassExercises;

import javax.swing.JOptionPane;

/**
 *
 * @author Murrayy
 */
public class SwopChars {
    public static void main(String[] args) {
        
        String word1 = JOptionPane.showInputDialog("Enter a word here. ");
        String word2 = JOptionPane.showInputDialog("Enter a word here. ");
        
        char letter1 = word1.charAt(0); 
        char letter2 = word2.charAt(0); 
        
        String finalWord1 = letter1 + word2.substring(1); 
        String finalWord2 = letter2 + word1.substring(1); 
        
        System.out.println(finalWord1 + "\n" + finalWord2);
          
    }
}
