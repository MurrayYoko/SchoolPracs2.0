package Forloops;


import java.awt.*;
import javax.swing.*;

public class PersonalDetails {

   public static void main(String[] args){
   
   //First name
   String firstName = JOptionPane.showInputDialog("What is your first name?");
   
   //Surname
   String surname = JOptionPane.showInputDialog("What is your surname?");
   
   //Phone number
   String phoneNum = JOptionPane.showInputDialog("What is your phone number?");
   
   //Date of birth
   String birthDate = JOptionPane.showInputDialog("What is your date of birth?");
   
   //Height
   String height = JOptionPane.showInputDialog("What is your height (m)?");
   
   System.out.println("your name is:" + firstName + " " + surname + " " + "your phone number is:" + phoneNum + " " + "Your Date of birth:" + birthDate + " " + "Your  height is:" + height + "m");

  }
  
}


