/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticePracG11T2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Murrayy
 */
public class RatingsArray {

    private static int[] rating;
    private static int size;

    public RatingsArray() throws FileNotFoundException {
        
        size = 0; 
        rating = new int[150];

        Scanner sc = new Scanner(new File("data\\clientRatings.txt"));

        while (sc.hasNext()) {
            //get an int from the file 
            int currentRating = sc.nextInt();

            //save the int to the array
            rating[size] = currentRating; 
            
            //increase size by 1
            size++; 
        }

    }

    public int getSize(){
        return size; 
    }
    
    public int getElement(int index){
        if(index >= size){
            throw new IndexOutOfBoundsException();
        }
        return rating[index];
    }
    
    public int getFirst(){
        return rating[0]; 
    }
    
    public int getLast(){
        return rating[size]; 
    }
    
    public String toString(){
        
        return "[" + rating + "]"; 
    }
}

//People [] peeps = new People[150];
//while (fileSc.hasNext()) {
//get an age from the file
//get name from file
//get email from file
//Person temp = new Person(name, age, email);
//save the temp to peeps array
//increase size by 1
//}
