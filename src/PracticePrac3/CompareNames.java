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
public class CompareNames {

    public static void main(String[] args) {
        //initialise
        String input = JOptionPane.showInputDialog("Enter a name here.");
        String mostAlpha = input;

        //test
        for (int i = 0; i < 4; i++) {
            //process
            if (input.compareTo(mostAlpha) > 0 ) {
                input = mostAlpha; 
            }
            //change
            input = JOptionPane.showInputDialog("Enter a name here.");
        }

        System.out.println("The most alphabetical name is: " + mostAlpha);
    }
}
