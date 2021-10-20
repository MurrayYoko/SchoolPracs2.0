/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Scanners_Writers;

/**
 *
 * @author Murrayy
 */
public class BaitMain {
    public static void main(String[] args) {
        
        BaitManager.printHello();
        
        String bait = BaitManager.getBait(); 
        
        System.out.println(bait);
        
        //BaitManager.addBait("topwater", "Frog");
        
        
    }
}
