package PracticePracT1;

import it.*;
import javax.swing.*;
import java.awt.*;

public class CapitalT{

   public static void main (String[] args){
   
   Gogga bug = new Gogga();
   bug.setPosition(5, 5);
   bug.setColor(Color.BLUE);
   bug.move();
   bug.move();
   bug.move();
   bug.move();
   
   bug.setPosition(3, 1);
   bug.setDirection(Gogga.RIGHT);
   bug.move();
   bug.move();
   bug.move();
   bug.move();
   
    System.out.println("x: " + bug.getXPos() + " and y: " + bug.getYPos());   

   }
}