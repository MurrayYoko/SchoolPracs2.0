package NumberAndStrings;


import javax.swing.JOptionPane;


public class CalculatingSalesPrice
{

   public static void main(String[] args)
   {
   
      String calcPrice = JOptionPane.showInputDialog("Enter a price here");
      double calcPrice_num = Double.parseDouble(calcPrice);
      
      double discount = calcPrice_num * 0.05;
      double discountprice = calcPrice_num - discount;
      
      double VAT = discountprice * 0.15;
      
      double total = discountprice + VAT; 
      
      
      
      System.out.println(total);
   
   }
}


