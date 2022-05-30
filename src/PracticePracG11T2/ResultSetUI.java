/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticePracG11T2;

import javax.swing.JOptionPane;

/**
 *
 * @author Murrayy
 */
public class ResultSetUI {
    public static void main(String[] args) {
        
        ResultSetManager r = new ResultSetManager("data\\results.txt"); 
       
        String name = JOptionPane.showInputDialog("Enter Username"); 
        String email = JOptionPane.showInputDialog("Enter email"); 
        int algSc = Integer.parseInt(JOptionPane.showInputDialog("Enter Algebra score")); 
        int geoSc = Integer.parseInt(JOptionPane.showInputDialog("Enter Geometry score")); 
        int trigSc = Integer.parseInt(JOptionPane.showInputDialog("Enter Trigonometry score")); 
        
        r.saveResult(name, email, algSc, geoSc, trigSc);
        
        r.printRatings(); 
    }
}
