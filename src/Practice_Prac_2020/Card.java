/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practice_Prac_2020;

/**
 *
 * @author Murrayy
 */
public class Card {

    private String name;
    private String type;
    private int basic;
    private int special;
    private int leader;
    private int unique;
    private int lightFactor = 3;
    private double darkFactor = 2.5;

    public Card(String nm, String typ, int base, int spscl, int lead, int unq) {
        nm = name;
        typ = type;
        base = basic;
        spscl = special;
        lead = leader;
        unq = unique;

    }

    public String getName() {
        return name;
    }

    public boolean checkLight() {
        if (type.equalsIgnoreCase("Light") == true) {
            return true;
        } else {
            return false;
        }
    }
    
    public Double calcPoints(){
        
        double total =0; 
        
        if (checkLight() == true) {
            total = (basic + special + leader + unique)*lightFactor; 
        }

        else {
            total = (basic + special + leader + unique)*darkFactor;  
        }
        
        return total; 
    }
    
    public void getNameTypePoints(){
        System.out.println("Name: " + getName() + "\nPoints: " + calcPoints());
    }
    
    public String toString(){
  
        System.out.println("Name: " + name + "\nType: " + type + "\nBasic: " + basic + "\nSpecial: " + special + "\nLeader: " + leader + "\nUnique: " + unique);
    
        if (checkLight()== true) {
            System.out.println("Type: Light \nLIGHTFACTOR = 3");
        }
        else{
            System.out.println("Type: dark \nDARKFACTOR = 2.5");
        }
        
        return null; 
    }
}
