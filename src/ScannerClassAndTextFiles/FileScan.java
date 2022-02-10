/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ScannerClassAndTextFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Murrayy
 */
public class FileScan {

    public static void main(String[] args) {

        try {
            String filePath = "data\\names.txt";
            File file = new File(filePath);
            Scanner sc = new Scanner(file);

            String mostAlpha = sc.nextLine();

            while (sc.hasNext()) {
                String currentName = sc.nextLine();
                int currentComp = currentName.compareTo(mostAlpha);

                if (currentComp < 0) {
                    mostAlpha = currentName;
                }
                
            }
            System.out.println(mostAlpha);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileScan.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
