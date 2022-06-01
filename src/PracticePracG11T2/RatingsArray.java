/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticePracG11T2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        sc.close();
    }

    public int getSize() {
        return size;
    }

    public int getElement(int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return rating[index];
    }

    public int getFirst() {
        return rating[0];
    }

    public int getLast() {
        return rating[size];
    }

    public String toString() {

        try {

            Scanner sc = new Scanner(new File("data\\clientRatings.txt"));

            String output = "[";

            while (sc.hasNext()) {

                int currentRating = sc.nextInt();

                output += currentRating + ", ";
            }

            sc.close();
            output += "]";
            return output;

        } catch (FileNotFoundException ex) {
            Logger.getLogger(RatingsArray.class.getName()).log(Level.SEVERE, null, ex);

            return null;
        }

    }

    public double getAverage() {

        double total = 0;

        for (int i = 0; i < size; i++) {

            int currentNum = rating[i];

            total += currentNum;
        }

        return total / size;
    }

    public void sort() {

        for (int currentIndex = 0; currentIndex < size; currentIndex++) {
            
            int smallestIndex = 0;

            for (int i = currentIndex; i < size; i++) {

                if (rating[i] > rating[smallestIndex]) {

                    smallestIndex = i;

                }
            }
            
            int temp = rating[currentIndex];
            rating[currentIndex] = rating[smallestIndex];
            rating[smallestIndex] = temp;
            

        }
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
