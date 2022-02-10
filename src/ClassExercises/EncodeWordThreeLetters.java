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
public class EncodeWordThreeLetters {

    public static void main(String[] args) {
        String word = JOptionPane.showInputDialog("Enter any word");
        word = word.toUpperCase();
        String output = "";
        if (word.length() > 3) {

            word = word.substring(3) + word.substring(0, 3);

            for (int i = 0; i < word.length(); i++) {

                char currentLetter = word.charAt(i);
                
                int nextLetter = currentLetter + 1; 
                
                if (nextLetter == 90) {
                    nextLetter = 65; 
                }
                
                char nextLetterChar = (char)nextLetter; 
                output += nextLetterChar; 
                
            }
        } else {
            String temp = "";
            
            for (int i = 0; i < word.length(); i++) {
                
                int wordLen = word.length(); 
                char currentLetter = word.charAt(wordLen);
                temp += currentLetter -1;
                
                System.out.println(temp);
            }
             
        }
        
        System.out.println(output);

    }
}
