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
public class RemoveChars {

    public static void main(String[] args) {
        //initialise
        String input1 = JOptionPane.showInputDialog("Input a sentence containing unwanted characters.");
        String input2 = JOptionPane.showInputDialog("Input the Characters to be removed from the first sentence.");
        String output = "";
        char currentLetter = input1.charAt(0);

        //test
        for (int i = 0; i < input1.length(); i++) {
            currentLetter = input1.charAt(i);
            //process
            if (!input2.contains(currentLetter + "")) {
                output = output + currentLetter;
            }
        }
        
        System.out.println(output);
    }
}
