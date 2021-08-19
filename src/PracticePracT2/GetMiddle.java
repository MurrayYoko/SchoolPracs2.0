package PracticePracT2;


import javax.swing.*;
import java.awt.*;

public class GetMiddle {
public static void main (String[] args){

String word = JOptionPane.showInputDialog("Input any word here!");

int len = word.length();

char middle = word.charAt(len/2);

System.out.println(middle);

   }
   
}