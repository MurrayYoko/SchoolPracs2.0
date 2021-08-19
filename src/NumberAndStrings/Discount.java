package NumberAndStrings;

 
import java.awt.*;
import javax.swing.*;

public class Discount {

   public static void main (String[] args){
   
      String price = JOptionPane.showInputDialog("Enter your amount spent (must be over R100)");
      int pricedigit = Integer.parseInt(price);
      
      int discount = 0;
      
      if (pricedigit >= 100)
      {
         discount = pricedigit * 10/100; 
      }
         System.out.print("Your discounted price is: " + (pricedigit - discount));
         
  }
}