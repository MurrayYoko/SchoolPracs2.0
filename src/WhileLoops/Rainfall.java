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
public class Rainfall {
    public static void main(String[] args) {
        
        String rainfall = JOptionPane.showInputDialog("enter the daily amount of rainfall recieved in mm.");
        int rainfallint = Integer.parseInt(rainfall);
        int count = 0; 
        int most = 0; 
        int highestday = 0;
        int total = 0;
         
        while(rainfallint > 0){
            count++; 
            
             if(rainfallint > most){
                 most = rainfallint; 
                 highestday = count; 
              }
             
            total = total + rainfallint;  
             
            rainfall = JOptionPane.showInputDialog("enter the daily amount of rainfall recieved in mm.");
            rainfallint = Integer.parseInt(rainfall);
            
           
        }
        int avg = total/count;   
        
        System.out.println("The total rain that fell during this period was: " + total + "mm." + "\n The average rainfall throughout this period was: " + avg + "mm." + "\n The maximum raifall was " + most + "mm " + " on day: " + highestday);       
    }
}

