/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WhileLoops;

import javax.swing.JOptionPane;

/**
 *
 * @author Murrayy
 */
public class StarStop {
    public static void main(String[] args) {
        
        String word = JOptionPane.showInputDialog("Enter a random character here");
        int count = 0; 
        
        while(!word.equals("*")){
            count++;
            
            word = JOptionPane.showInputDialog("Enter a random character here");

        }
        
        System.out.println(count + " Chars entered");
    }
}
