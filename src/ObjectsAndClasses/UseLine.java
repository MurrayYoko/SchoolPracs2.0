/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ObjectsAndClasses;

import javax.swing.JOptionPane;

/**
 *
 * @author Murrayy
 */
public class UseLine {
    public static void main(String[] args) {
        
        String sizeIn = JOptionPane.showInputDialog("Enter a size"); 
        String patternIn = JOptionPane.showInputDialog("Enter a patern"); 
        
        Line l = new Line();
        
        l.size = Integer.parseInt(sizeIn);
        l.pattern = patternIn.charAt(0); 
        l.draw();
        
    }
    ; 
}
