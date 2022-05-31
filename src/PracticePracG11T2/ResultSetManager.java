/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticePracG11T2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Murrayy
 */
public class ResultSetManager {
    private String filePath = "data\\results.txt"; 
    
    public ResultSetManager(String f){
        f = filePath; 
    }
    
    public void saveResult(String n, String e, int sA, int sG, int sT){
        
        try { 
            
            ResultSet rs = new ResultSet(n, e, sA, sG, sT);
            FileWriter fw = new FileWriter(filePath, true);
            fw.append(rs.toString() + "\n");
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(ResultSetManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String printRatings(){
        
        try { 
            Scanner sc = new Scanner(new File(filePath)).useDelimiter("#");
            ResultSet highest = null; 
            int count =0;
            int total = 0; 
            System.out.println("MATH APP - ALL RESULTS" + "\n-------------------\n" );
            
             while (sc.hasNextLine()) {
               String currentLine = sc.nextLine();  
               Scanner lineScanner = new Scanner(currentLine).useDelimiter("#"); 
               
               String name = lineScanner.next(); 
               String email = lineScanner.next(); 
               int algSco = lineScanner.nextInt(); 
               int geoSco = lineScanner.nextInt(); 
               int trigSco = lineScanner.nextInt(); 
               
                 
               ResultSet r = new ResultSet(name , email, algSco, geoSco, trigSco); 
               count++; 
               total += r.getRating(); 
               
                 if (highest == null) {
                     highest = r; 
                 }
               if (r.getRating() > highest.getRating()) {
                     highest = r;
                }

                 System.out.println(r.nameAndRating());
               
            }
            System.out.println("Avg: " + total/count);
            System.out.println("Highest was " + highest.getName() + " with score of " + highest.getRating() );
            //store results set = new (variable,)
            
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }
        return null;
        
    }
    }

