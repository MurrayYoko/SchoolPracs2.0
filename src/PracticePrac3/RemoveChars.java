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
        

        //test
        for (int i = currentLetter; i > input1.length(); i++) {
        int currentLetter = input1.charAt(i);
            //process
            if (!input2.contains(currentLetter)) {
            output += currentLetter;
            }
        }
    }
}
