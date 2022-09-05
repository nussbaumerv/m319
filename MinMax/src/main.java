package ch.tbz;
import java.util.Objects;
import java.util.Scanner;

import static ch.tbz.lib.Input.inputString;

public class numberCompersion {
    static void getAndCompereInputs(){
        Scanner scan = new Scanner(System.in);
        int inputA;
        int inputB;
        int inputC;

        System.out.println("Geben Sie die Zahl A ein");
        inputA = scan.nextInt();

        System.out.println("Geben Sie die Zahl B ein");
        inputB = scan.nextInt();

        System.out.println("Geben Sie die Zahl C ein");
        inputC = scan.nextInt();

        if (inputA == inputB && inputB == inputC){
            System.out.println("Alle Zahlen sind gleich");
        } else if(inputA == inputB) {
            System.out.println("A und B sind gleich");
        } else if (inputA == inputC) {
            System.out.println("A und C sind gleich");
        }
        else if(inputB == inputC){
            System.out.println("A und C sind gleich");
        }
        else{
            System.out.println("Alles Zahlen sing ungleich");
        }

    }
    public static void main() {
        boolean keepComparing = true;
        do {
            System.out.println("Welcome to my Number Coperison");
            String launch = inputString("Type 'yes' to launch my Programm: ");

            if(Objects.equals(launch, "yes")){
                getAndCompereInputs();
            }
            else{
                System.out.println("Thanks for using my Programm");
                keepComparing = false;
            }
        }
        while(keepComparing == true);
    }
}