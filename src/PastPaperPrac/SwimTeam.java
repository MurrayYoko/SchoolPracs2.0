/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PastPaperPrac;

import javax.swing.JOptionPane;

/**
 *
 * @author Murrayy
 */
public class SwimTeam {

    static String name;
    static String teamListA;
    static String teamListB;
    static String teamListReserve;
    static String nameInput;
    static int countA = 0;
    static int countB = 0;
    static int countReserve = 0;
    static double avgTime = 0;

    public static void main(String[] args) {

        teamListA = "Team A \n";
        teamListB = "Team B \n";
        teamListReserve = "Team Reserve \n";

        nameInput = JOptionPane.showInputDialog("Enter a swimmer's name here.");
        
       // while (()) {
        //    ;
            
        //}
       
        oneSwim();
    }

    public static void oneSwim() {
        System.out.println("Swimmer Name: " + nameInput);

        int totalTime = 0;
        int teamACount = 0;
        int teamBCount = 0;
        int reserveTeamCount = 0;

        for (int i = 1; i < 5; i++) {

            int swimMin = (int) (Math.random() * 3) + 2;
            int swimSec = (int) (Math.random() * 60);
            int swimTime = swimMin * 60 + swimSec;
            totalTime = totalTime + swimTime;

            System.out.println("Swimmer Time " + i + ": " + swimMin + " min " + swimSec + " sec " + " Total swim time in seconds: " + swimTime);
        }
        String team = null;
        double avgTime = totalTime / 4;
        
        if (avgTime <= 160) {
            team = teamListA;
            teamACount++;
        }

        if (avgTime <= 210) {
            team = teamListB;
            teamBCount++;
        }

        if (avgTime >= 210) {
            team = teamListReserve;
            reserveTeamCount++;
        }
        System.out.println("Total time for all 4 times: " + totalTime + " seconds " + "\n" + "Average time for all 4 times: " + avgTime + " seconds" + "\n" + "Team: " + team);
    }
}
