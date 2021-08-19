package PracticePracT1;


import javax.swing.*;
import java.awt.*;

public class GetInitials{

   public static void main (String[] args){
   
   
   String firstName = JOptionPane.showInputDialog("What is your first name?");
   String lastName = JOptionPane.showInputDialog("What is your last name?");
   
   char fl = firstName.charAt(0);
   char ll = lastName.charAt(0);

   System.out.println(fl + "" + ll);


 
  }
  
}