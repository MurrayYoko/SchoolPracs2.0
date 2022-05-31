
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticePracG11T2;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Murrayy
 */
public class RatingsArrayUI {
    public static void main(String[] args) {
        
        
        RatingsArray rA;
        try {
            rA = new RatingsArray();
            
            System.out.println(rA.getElement(120));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(RatingsArrayUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
