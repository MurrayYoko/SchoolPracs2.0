package Forloops;


import javax.swing.*;
import java.awt.*;

public class Prices {

   public static void main (String[] args) {
   
   //first fruit
   String firstFruit = JOptionPane.showInputDialog("What should the first fruit be?");
   String ffPrice = JOptionPane.showInputDialog("How much should the first fruit be sold for?");
   
   //second fruit
   String secondFruit = JOptionPane.showInputDialog("What should the second fruit be?");
   String sfPrice = JOptionPane.showInputDialog("How much should the second fruit be sold for?");
   
   //Third fruit
   String thirdFruit = JOptionPane.showInputDialog("what should the third fruit be?");
   String tfPrice = JOptionPane.showInputDialog("How much should the third fruit be sold for?");
   
   System.out.println("SHOPPING LIST" + " " + firstFruit + "-" + ffPrice + " " + secondFruit + "-" + sfPrice + " " + thirdFruit + "-" + tfPrice );
   

   double total = Integer.parseInt( ffPrice + sfPrice + tfPrice);
   System.out.println(total);
   
   }
 }
   


