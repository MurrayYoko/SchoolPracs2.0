/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Scanners_Writers;

import javax.swing.JOptionPane;

/**
 *
 * @author Murrayy
 */
public class BookMain {

    public static void main(String[] args) {
        
        BookManager.printHello();
        
        String books = BookManager.getBooks();
        
        System.out.println(books);
        
    
        BookManager.addBook("Julians CookBook", "Julian");
        
        books = BookManager.getBooks();
        
        System.out.println(books);
    }
}
