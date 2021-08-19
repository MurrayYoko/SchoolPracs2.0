package PracticePracT1;


import javax.swing.*;
import java.awt.*;

public class HotelCalc{

   public static void main (String[] args){
   
   String numPeople = JOptionPane.showInputDialog("How many people?");
   String numNights = JOptionPane.showInputDialog("How many nights?");
   
   double costPN = 490.90;
   
   int numPeopleInt = Integer.parseInt(numPeople);
   int numNightsInt = Integer.parseInt(numNights);
   
   double total = numPeopleInt * numNightsInt * costPN;
   double discount = total*10/100;
   
   System.out.println("Discounted total = " + (total-discount));
   
   }
}
