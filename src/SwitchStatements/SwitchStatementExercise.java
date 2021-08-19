package SwitchStatements;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.swing.JOptionPane;

/**
 *
 * @author Murrayy
 */
public class SwitchStatementExercise {

    public static void main(String[] args) {

        String nam1 = (JOptionPane.showInputDialog("Enter your first name here"));
        String nam2 = (JOptionPane.showInputDialog("Enter your last name here"));
        String choice = JOptionPane.showInputDialog("choose what you would like to see: 1. Initials 2. Uppercase 3. Amount of letters 4. Alphabetical order 5. Name and surname");
        int choiceInt = Integer.parseInt(choice);

        switch (choiceInt) {
            case 1:
                System.out.println(nam1.charAt(0) + "" + nam2.charAt(0));
                break;

            case 2:
                System.out.println(nam1.toUpperCase() + " " + nam2.toUpperCase());
                break;

            case 3:
                System.out.println("The amount of letters in your name is: " + (nam1.length() + nam2.length()));
                break;

            case 4:
                if (nam1.compareTo(nam2) > 0) {
                    System.out.println(nam2 + " is more alphabetical.");

                } else if (nam1.compareTo(nam2) < 0) {
                    System.out.println(nam1 + " is more alphabetical.");
                } else if (nam1.compareTo(nam2) == 0) {
                    System.out.println(nam2 + " is more alphabetical.");
                }

                break;

            default:
                System.out.println("Your name is " + nam1 + " " + nam2);
                break;

        }

    }

}
