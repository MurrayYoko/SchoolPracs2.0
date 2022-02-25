/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ScannerClassAndTextFiles;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Murrayy
 */
public class WriteToTextFile {
    public static void main(String[] args) {
        
        String filePath = "data\\positions.txt"; 
        FileWriter fw = null; 
        
        try { 
            
            fw = new FileWriter(filePath,true);
            PrintWriter pw = new PrintWriter(fw); 
            
            String firstName = "";
            
            pw.println();
            pw.close();
        } catch (IOException ex) {
            Logger.getLogger(WriteToTextFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
