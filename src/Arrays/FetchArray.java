/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MurrayY
 */
public class FetchArray {

    public static void main(String[] args) {

        try {

            String filePath = "data//random numbers.txt";
            File file = new File(filePath);
            Scanner sc = new Scanner(file).useDelimiter("#");

            int[] numArray = new int[5];
            int i = 0;
            int largest = -1;
            
            while (sc.hasNext()) {

                numArray[i] = sc.nextInt();
                i++;

            }            
            
            for (int j = 0; j < numArray.length; j++) {
                
                if (numArray[j] > largest) {
                    largest = numArray[j]; 
                }
                
            }
            
            
            System.out.println(largest);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(FetchArray.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public void bubbleSort(int [] arr){
        
    }
    
    public void insertionSort(int [] arr){
        
    }
    
}
