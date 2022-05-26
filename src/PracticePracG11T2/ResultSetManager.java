/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticePracG11T2;

import java.io.FileWriter;
import java.io.IOException;
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
            fw.append(rs.toString());
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(ResultSetManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public printRatings(){
        
    }
}
