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
public class Oldest {

    public static void main(String[] args) {

        int oldest = 0;
        String oldestName = "";

        String input = JOptionPane.showInputDialog("Enter a boy's name and age.");

        while (!input.equalsIgnoreCase("stop")) {

            Scanner sc = new Scanner(input);
            String name = sc.next();
            int age = sc.nextInt();

            if (oldest < age) {
                oldest = age;
                oldestName = name;
            }
            input = JOptionPane.showInputDialog("Enter a boy's name and age. "); 
        }
        System.out.println("Oldest boy: " + oldestName + "\nAge: " + oldest);
    }
}
