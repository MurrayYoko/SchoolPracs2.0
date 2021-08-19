package NumberAndStrings;


import java.awt.*;
import javax.swing.*;

public class eastercode {

   public static void main(String[] args) {
      
      String inputyear = JOptionPane.showInputDialog("Enter any year from 1900 to 2099"); 
      int yeardigit = Integer.parseInt(inputyear);
      
      int a = yeardigit - 1900;
      int b = a%19;
      int c = (7 * b + 1)/19;
      int d = (11 * b + 4 - c)%29;
      int e = a/4;
      int f = (a + e + 31 - d)%7;
      int g = 25 - d - f;
      
      if (g > 0){
         System.out.println("April "+g);
      }   
      else{
         System.out.println("March "+ (31+g));
     }             
               
               
   
   }
   
}
   
   
   