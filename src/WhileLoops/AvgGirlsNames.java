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
public class AvgGirlsNames {
    public static void main(String[] args) {
        
        String name = JOptionPane.showInputDialog("enter a female name here.");
        int count = 0; 
       int sum = 0;
        
        while(!name.equals("*")){
          count++;         
          
           int nameLen = name.length();
           sum = sum + nameLen;
           name = JOptionPane.showInputDialog("enter a female name here.");
           
        }
        double avgLen = sum/count;
        System.out.println("Average length of names is: " + avgLen);
    }
}
