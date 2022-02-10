/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ScannerClassAndTextFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Murrayy
 */
public class Ages {
    public static void main(String[] args) {
        try { 
            
            String filePath = "data//ages.txt"; 
            File file = new File(filePath);
            Scanner sc = new Scanner(file);
            int avgAge = 0; 
            int allAges = 0; 
            int count = 0; 
            
            while (sc.hasNext()) {
                count++; 
                int currentAge = sc.nextInt();
//                int currentAge = Integer.parseInt(sc.next());
                allAges = allAges + currentAge; 
                
            }
                 avgAge = allAges/count;    
                System.out.println(avgAge);
                    
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ages.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
