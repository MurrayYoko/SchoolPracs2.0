/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author Murrayy
 */
public class Array {
    public static void main(String[] args) {
        
        //Finding the average within an array of numbers
        
        int[] numArray = {10, 23, 45, 17, 8}; 
        int sum =0;
        int numNums = numArray.length; 
        int highest =0; 
        int lowest =0; 
        
        
        for (int i = 0; i < numArray.length; i++) {
             sum += numArray[i];
             
             if (highest < i) {
                highest = i; 
            }
             
            if(lowest < highest){
                
            }
             
        }
         
        double avg = sum/numNums; 
        System.out.println(avg);
    }
}
