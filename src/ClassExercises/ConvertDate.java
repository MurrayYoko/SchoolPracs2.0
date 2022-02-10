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
public class ConvertDate {
    public static void main(String[] args) {
        
        String date = JOptionPane.showInputDialog("Enter a date in order DDMMYYYY"); 
        
        String day = date.substring(0, 2); 
        String month = date.substring(2, 4); 
        String year = date.substring(4, 8);
         
        
        
        
        if (day.charAt(0)== '0') {
            day = "" + day.charAt(1); 
        }
        
        if (month.charAt(0)== '0') {
            month = "" + month.charAt(1); 
        }
        String flippedDate = year + "/" + month + "/" + day; 
        
        System.out.println(flippedDate);
        
    }
}
