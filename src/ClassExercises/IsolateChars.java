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
public class IsolateChars {
    public static void main(String[] args) {
        
        String word = JOptionPane.showInputDialog("Enter a word here.");
        
        String temp = "";
        String temp2 = ""; 
        int wordLen = word.length(); 
        int lastLetter = word.length() - 1; 
        int secondLetter = word.charAt(1);   
 
        
        for (int i = wordLen -1; i >= 0; i--) {
            temp = temp + word.charAt(i); 
        }
        
//        to complete.
        for (int i = 0; i < wordLen /2.0; i++) {
           
            temp2 = temp2 + word.charAt(i); 
            temp2 = temp2 + word.charAt((wordLen - 1) - i); 
           
            if () {
                    
                } 
        }
        
        System.out.println("Your word is: " + word);
        
        System.out.println("The word backwards is: " + temp );
        System.out.println(temp2);
       
        
//        System.out.println("The second letter of the word is: " + secondLetter);
//        System.out.println("The first letter of your word is: " + word.charAt(0));
//        System.out.println("The last letter of your word is: " + word.charAt(lastLetter));
        
    }
}
