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
public class Heights {
    public static void main(String[] args) {
        
        String name = JOptionPane.showInputDialog("Enter a name here.");
         
        String heights = JOptionPane.showInputDialog("enter a Height in meters here");
        double heightnum = Double.parseDouble(heights);
        double highest = heightnum;
        double shortest = heightnum;
        
        while(heightnum > 0){
           
             if(heightnum > highest){
                 highest = heightnum; 
                String highestname = name;
              }
             
             if (heightnum < shortest && heightnum > 0){
                 shortest = heightnum; 
                 String shortestname = name; 
             }
            name = JOptionPane.showInputDialog("enter a name here.");
            heights = JOptionPane.showInputDialog("enter a Height in meters here");
            heightnum = Double.parseDouble(heights);
        }
         System.out.println("The tallest height is: " + highest + " meters. " + name + "\nThe shortest height is: " + shortest + " meters. ");       
    }
            
}
