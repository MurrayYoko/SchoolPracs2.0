package PracticePracT2;

import it.*;
import javax.swing.*;
import java.awt.*;

public class MakeSquare {

   public static void main (String[] args){
   
   Gogga bug = new Gogga();
   
   String trailWidth = JOptionPane.showInputDialog("How wide must the trail be?");
   
    int trailWidthInt = Integer.parseInt(trailWidth);
   
   bug.setTrailWidth(trailWidthInt);
   
   bug.move();
   bug.move();


 }

}