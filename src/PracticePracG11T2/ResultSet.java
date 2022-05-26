/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticePracG11T2;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Murrayy
 */
public class ResultSet {
   
       private String name; 
       private String email; 
       private int  scoreAlg; 
       private int scoreGeo; 
       private int scoreTrig; 
    
    
    public ResultSet(String n, String e, int sA, int sG, int sT){
        name = n; 
        email = e; 
        scoreAlg = sA; 
        scoreGeo = sG; 
        scoreTrig = sT; 
    }
    
    public String getName(){
        return name; 
    }
    
    public void setName(String newName){
        
        newName = JOptionPane.showInputDialog("Enter a new name here. "); 
        name = newName; 
    }
    
    public String toString(){
        return( name + "#" + email + "#" + scoreAlg + "#" + scoreGeo + "#" + scoreTrig); 
    }
    
    public double getRating(){
        return ((scoreAlg*0.35) + (scoreGeo*0.45) + (scoreTrig*0.2)); 
    }
    
    public String reformatName(){
        Scanner sc = new Scanner(name); 
        
        String initials = ""; 
        String output = "";
         
        while (sc.hasNext()) {
            String currentName = sc.next(); 
        
            if (sc.hasNext()){
                initials += currentName.charAt(0);
            }
            else{
                output = currentName + initials; 
            }
        }
        return output; 
    } 
    
    public String nameAndRating(){
        return reformatName() + "   " + getRating(); 
    }
    
  
}


