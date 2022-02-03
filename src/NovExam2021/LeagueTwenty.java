/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NovExam2021;

import javax.swing.JOptionPane;

/**
 *
 * @author Murrayy
 */
public class LeagueTwenty {
    public static String currentPlayerName;
    public static int currentPlayerAverage = 0;
    public static int currentPlayerFifties = 0; 
    public static int numPlayers = 0; 

    public static void main(String[] args) {
        
        currentPlayerName = JOptionPane.showInputDialog("Enter a player's name here."); 
        
        System.out.println("=============== \n PLAYER STATS \n==============="); 
        
        while (!currentPlayerName.equalsIgnoreCase("XXX")) {
            
            System.out.println("NAME: " + currentPlayerName);
            
            currentPlayerName = JOptionPane.showInputDialog("Enter a player's name here.");
            numPlayers++; 
        }
    }
    
    public static void GeneratePlayer() {
    
        int playerExperience = (int) (Math.random() * 3) + 1 ; 
        
        if (playerExperience == 3) {
            System.out.println("EXP: expert");
        }
        
         if (playerExperience == 2) {
            System.out.println("EXP: senior");
        }
        
          if (playerExperience == 1) {
            System.out.println("EXP: junior");
        }
        //4.4
}
}
