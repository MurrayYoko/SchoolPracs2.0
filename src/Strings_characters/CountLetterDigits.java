/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Strings_characters;

import javax.swing.JOptionPane;

/**
 *
 * @author Murrayy
 */
public class CountLetterDigits {

    public static void main(String[] args) {

        //initialise variable
        int letterCount = 0;
        int digitCount = 0;
        int otherCount =0;
        char character = JOptionPane.showInputDialog("enter a character").charAt(0);
        //check variable
        while (character != 'x' && character != 'X') {
            //process variable
            System.out.println(character);
            //change variable
            character = JOptionPane.showInputDialog("enter a character").charAt(0);

            if (Character.isLetter(character)) {
                letterCount++;
                
            } else {
                
                if (Character.isDigit(character)) {
                    digitCount++;
                    
                } else {
                    
                   otherCount++; 
                    }
                }
            }

        System.out.println("");
        }

    }

