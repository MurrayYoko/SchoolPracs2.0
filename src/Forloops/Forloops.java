package Forloops;


import javax.swing.*;
import java.awt.*;

public class Forloops {
   
   public static void main(String[] args){
         int num = 0 ;
         
         for (int loop = 8; loop > 5; loop = loop - 1)
         {
            num = num +1; 
            System.out.println("The loop has bee carried out " + num + "time(s).");
            System.out.println ("The value of the loop control variable is " + loop);
            
            System.out.println();
         }
         
         System.out.println ("The loop has ended now.");
   
   }
 }