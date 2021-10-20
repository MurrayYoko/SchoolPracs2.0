/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Scanners_Writers;

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
public class BookManager {
    
    private static String filePath = "data\\books.txt";
    
    public static void printHello(){
        System.out.println("Hello");
    }
    
    
    public static String getBooks(){
        String output = "";
        try {
            
            File f = new File(filePath);
            Scanner fileSc = new Scanner(f);
            
            while(fileSc.hasNextLine()){
                String line = fileSc.nextLine();
                
                Scanner lineSc = new Scanner(line).useDelimiter("#");
                
                //START CODE HERE
                String title = lineSc.next();
                String author = lineSc.next();
                
                output += "BOOK: " + title + "  AUTHOR: " + author + "\n";
                
                //END CODE HERE
                
                lineSc.close();
            }
            
            fileSc.close();
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BookManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return output;
    }
    
    
    public static void addBook(String title, String author){
        FileWriter fw = null;
        try {
            fw = new FileWriter(filePath, true);
            PrintWriter pw = new PrintWriter(fw);
            
            //START CODE HERE
            
            pw.println(title + "#" + author);
            
            //END CODE HERE
            
            pw.close();
        } catch (IOException ex) {
            Logger.getLogger(BookManager.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(BookManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
