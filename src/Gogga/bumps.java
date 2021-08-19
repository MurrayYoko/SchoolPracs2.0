package Gogga;

import it.*;
import javax.swing.*;
import java.awt.*;

public class bumps { 

public static void main (String[] args) {

Gogga bug = new Gogga();

bug.setColor(Color.BLUE);
bug.setPosition(1,5);
bug.setDirection(Gogga.UP);

bug.move();
bug.move();

bug.setDirection(Gogga.RIGHT);

bug.move();
bug.move();

bug.setDirection(Gogga.DOWN);

bug.move();
bug.move();

bug.setDirection(Gogga.RIGHT);

bug.move();
bug.move();

bug.setDirection(Gogga.UP);

bug.move();
bug.move();

bug.setDirection(Gogga.RIGHT);

bug.move();
bug.move();

bug.setDirection(Gogga.DOWN);

bug.move();
bug.move();

bug.setDirection(Gogga.RIGHT);

bug.move();
bug.move();

int bugX = bug.getXPos();
int bugY = bug.getYPos();

System.out.println("X : " + " " + bugX + " , " + "Y : " + bugY);
   }
}
