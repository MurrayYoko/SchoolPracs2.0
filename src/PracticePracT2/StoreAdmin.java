package PracticePracT2;


import javax.swing.*;
import java.awt.*;

public class StoreAdmin {

public static void main (String[] args) {

double colaPrice = 13.90;
double barOnePrice = 12.00;
double waterPrice = 9.50;

String colaInput = JOptionPane.showInputDialog("How many cans of Coca Cola would you like to purchase?");
String barOneInput = JOptionPane.showInputDialog("How many BarOnes would you like to purchase?");
String waterInput = JOptionPane.showInputDialog("How many bottles of water would you like to purchase?");

double colaDub = Double.parseDouble(colaInput);
double barOneDub = Double.parseDouble(barOneInput);
double waterDub = Double.parseDouble(waterInput);


double colaTotal = colaDub * colaPrice;
double barOneTotal = barOneDub * barOnePrice;
double waterTotal = waterDub * waterPrice;


double finalTotal = (colaTotal + barOneTotal + waterTotal);
System.out.print(finalTotal);

  }
}
