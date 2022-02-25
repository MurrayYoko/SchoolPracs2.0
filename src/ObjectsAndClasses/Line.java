/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ObjectsAndClasses;

/**
 *
 * @author Murrayy
 */
public class Line {
    int size = 2; 
    char pattern = '*';
    
    public void drawVert(){
        
        for (int i = 1; i <= size; i++) {
            System.out.println(pattern);
        }
    }
    
    public void draw(){
        
        for (int i = 1; i <= size; i++) {
            System.out.print(pattern);
        }
    }
    
    public void TestLine(){
        
    }
}
