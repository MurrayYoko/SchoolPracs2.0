package PracticePracT1;


import javax.swing.*;
import java.awt.*;

public class IdentityCode{

   public static void main(String[] args){
   
   String firstName = JOptionPane.showInputDialog("What is your first name?");
   String lastName = JOptionPane.showInputDialog("What is your last name?");
   String age = JOptionPane.showInputDialog("What is your age?");
   
   char fl = firstName.charAt(0);
   char ll = lastName.charAt(0);
   
   int newAge = Integer.parseInt(age) - 4;
  
   System.out.println(fl + "" + ll);
   System.out.println("Four years ago, you were:" + newAge);

   }
}



   
