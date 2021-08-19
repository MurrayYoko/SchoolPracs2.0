package NumberAndStrings;


import java.awt.*;
import javax.swing.*;

public class TestAnotherNumber {

public static void main (String[] args){

    String inputnum = JOptionPane.showInputDialog("Input any integer");
      int numint = Integer.parseInt(inputnum);
      
     if (numint %2 == 0){
         System.out.println("Your number is even.");
      }
      
      else {
         System.out.println("Your number is odd.");
         
       if (numint <= 0){
         System.out.println("your number is positive");
      }
      
      else {
         System.out.println("Your number is negative");
      }
   
       if (numint %7 == 0){
         System.out.println("Your number is a multiple of seven.");
      }
      
      else {
         System.out.println("Your number is not a multiple of seven.");
      }
   
        
         
      }

  }
}
 