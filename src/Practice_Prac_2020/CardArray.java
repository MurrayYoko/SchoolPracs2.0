/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practice_Prac_2020;

import java.util.Scanner;

/**
 *
 * @author Murrayy
 */
public class CardArray {
    private Card[] cArr= new Card[20]; 
    
    private int size = 0; 
    
    public CardArray(){
        
        Scanner fileSc = new Scanner("data\\cards.txt");
        
        while (fileSc.hasNext()) {
            
            String line = fileSc.nextLine(); 
            
            Scanner lineScanner = new Scanner(line).useDelimiter("#"); 
            
            String name = lineScanner.next(); 
            String type = lineScanner.next(); 
            int basicAb = lineScanner.nextInt(); 
            int specialAb = lineScanner.nextInt(); 
            int leaderAb =  lineScanner.nextInt(); 
            int uniqueAb = lineScanner.nextInt();
            
            cArr[size] = new Card(name, type, basicAb, specialAb, leaderAb, uniqueAb); 
            
            size++; 
        
        }
        
    }
    
    public String toString(){
       
    }
    
}
