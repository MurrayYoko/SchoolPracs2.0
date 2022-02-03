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
public class CountWords {
    public static void main(String[] args) {
        
        int count = 0; 
        String word = JOptionPane.showInputDialog("Enter a word here."); 
        
        while (!(word.equalsIgnoreCase("stop"))) {
            count++;
            word = JOptionPane.showInputDialog("Enter a word here.");
        }
        System.out.println(count);
    }
}
