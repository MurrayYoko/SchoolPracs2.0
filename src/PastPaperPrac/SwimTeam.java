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
    static String highestName;
    static String lowestName;
    static String teamAName = "";
    static String teamBName = "";
    static String reserveName = "";
    static int countA = 0;
    static int countB = 0;
    static int countReserve = 0;
    static double avgTime = 0;
    static double lowestAvg = avgTime;

    public static void main(String[] args) {

        teamListA = "Team A \n";
        teamListB = "Team B \n";
        teamListReserve = "Team Reserve \n";

        nameInput = JOptionPane.showInputDialog("Enter a swimmer's name here.");

        while (!nameInput.equalsIgnoreCase("XXX")) {
            //saves average time
            oneSwim();
            if (lowestAvg == 0) {
                lowestAvg = avgTime;
                lowestName = nameInput;
            }
            if (avgTime < lowestAvg && avgTime > 0) {
                lowestAvg = avgTime;
                lowestName = nameInput;
            }

            nameInput = JOptionPane.showInputDialog("Enter a swimmer's name here.");
        }
        System.out.println("The fastest swimmer was " + lowestName + " with an average time of: " + lowestAvg + " seconds." + "\n");

        displayTeamList();
    }

    public static void oneSwim() {
        System.out.println("Swimmer Name: " + nameInput);

        int totalTime = 0;

        for (int i = 1; i < 5; i++) {

            int swimMin = (int) (Math.random() * 3) + 2;
            int swimSec = (int) (Math.random() * 60);
            int swimTime = swimMin * 60 + swimSec;
            totalTime = totalTime + swimTime;

            System.out.println("Swimmer Time " + i + ": " + swimMin + " min " + swimSec + " sec " + " Total swim time in seconds: " + swimTime);
        }
        String team = null;
        avgTime = totalTime / 4;

        if (avgTime <= 160) {
            team = teamListA;
            teamAName += nameInput + ", ";
            countA++;
        }

        if (avgTime <= 210) {
            team = teamListB;
            teamBName += nameInput + ", ";
            countB++;
        }

        if (avgTime >= 210) {
            team = teamListReserve;
            reserveName += nameInput + ", ";
            countReserve++;
        }
        System.out.println("Total time for all 4 times: " + totalTime + " seconds " + "\n" + "Average time for all 4 times: " + avgTime + " seconds" + "\n" + "Team: " + team);
    }

    public static void displayTeamList() {

        System.out.println(teamListA + "Amount of A-team swimmers: " + countA + "\n" + "Names: " + teamAName + "\n");
        System.out.println(teamListB + "Amount of B-team swimmers: " + countB + "\n" + "Names: " + teamBName + "\n");
        System.out.println(teamListReserve + "Amount of Reserve-team swimmers: " + countReserve + "\n" + "Names: " + reserveName + "\n");
    }
}
