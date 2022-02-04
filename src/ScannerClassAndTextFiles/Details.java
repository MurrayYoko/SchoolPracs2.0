/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ScannerClassAndTextFiles;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Murrayy
 */
public class Details {
    public static void main(String[] args) {
        
        String details = JOptionPane.showInputDialog("Input your name, ID number, height in metres, and whether you smoke (True or false)");
        
        Scanner sc = new Scanner(details); 
        
        String name = sc.next(); 
        String id = sc.next(); 
        double height = sc.nextDouble(); 
        boolean smoke = sc.nextBoolean(); 
        
        System.out.println("Name: " + name + "\nID Number: " + id + "\nHeight: " + height + "\nSmoking?: " + smoke);
    }
}
