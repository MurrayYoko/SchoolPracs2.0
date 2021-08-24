package JuneExam;

import javax.swing.JOptionPane;

public class Factors {

    public static void main(String[] args) {

        String num = JOptionPane.showInputDialog("Enter any Integer here");
        int numint = Integer.parseInt(num);
        int intTotal = 0;
        int factorCount = 0;

        System.out.print("The factors of " + numint + " are: ");
        for (int i = 1; i <= numint; i++) {

            if (numint % i == 0) {
                System.out.print(i + " ");
                factorCount += 1;

                if (i != numint) {
                    intTotal += i;
                }
            }

        }
        System.out.println();
        
        System.out.println("The sum of the factors are: " + intTotal );
        
        if (factorCount == 2) {
            System.out.println(numint + " is a prime number.");
        } else if (factorCount > 2) {
            System.out.println(numint + " is a composite number.");
            if (intTotal == numint) {
                System.out.println(numint + " is a perfect number.");

            } else {
                System.out.println(numint + " is NOT a perfect number.");
            }

        }

    }
}
