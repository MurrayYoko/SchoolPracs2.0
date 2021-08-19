package IfStatements;

//challenge 1

import javax.swing.*;
import java.awt.*;

public class Oddoreven{ 

   public static void main(String[] args) {
   
      String word1 = JOptionPane.showInputDialog("Enter first word here!");
      int num = word1.length();
      
      if(num %2 == 0){
         System.out.println("Your word has an even number of letters");
      }
      
      else {
         System.out.println("Your word has an odd number of letters");
      }
   }
}   
   
   
   
  
   