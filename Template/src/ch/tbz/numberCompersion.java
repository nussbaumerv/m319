package ch.tbz;
import java.util.Objects;
import java.util.Scanner;

import static ch.tbz.lib.Input.inputString;

public class numberCompersion {
    public static void main() {
        boolean keepComparing = true;
        System.out.println("Welcome to my Number Coperison");
        do {
            Scanner scan = new Scanner(System.in);
            int inputA;
            int inputB;
            int inputC;

            //inputs
            System.out.println("Enter the number A");
            inputA = scan.nextInt();

            System.out.println("Enter the number B");
            inputB = scan.nextInt();

            System.out.println("Enter the number C");
            inputC = scan.nextInt();

            //check input
            if (inputA == inputB && inputB == inputC){
                System.out.println("All Numbers are the same");
                keepComparing = false;
            } else if(inputA == inputB) {
                System.out.println("A and B are the same");
            } else if (inputA == inputC) {
                System.out.println("A and C are the same");
            }
            else if(inputB == inputC){
                System.out.println("B and C are the same");
            }
            else{
                System.out.println("None of the numbers are the same");
            }

        }
        while(keepComparing == true);
        //finsih
        System.out.println("Thanks for using my Programm");
    }
}