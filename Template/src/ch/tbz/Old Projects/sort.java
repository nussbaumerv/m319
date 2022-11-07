package ch.tbz;
import java.util.Objects;
import java.util.Scanner;
import java.util.Arrays;

import static ch.tbz.lib.Input.inputString;

public class sort {
    public static void main() {
        System.out.println("Welcome to my number sorter");
        Scanner scan = new Scanner(System.in);
        int inputA;
        int inputB;
        int inputC;
        int inputD;

        System.out.print("Enter the value A: ");
        inputA = scan.nextInt();

        System.out.print("Enter the value B: ");
        inputB = scan.nextInt();

        System.out.print("Enter the value C: ");
        inputC = scan.nextInt();

        System.out.print("Enter the value D: ");
        inputD = scan.nextInt();

        int arrDyn[] = {inputA, inputB, inputC, inputD};
        Arrays.sort(arrDyn);
        System.out.println("\nYour sorted array: ");

        for (int i = 0; i < arrDyn.length; i++) {
            int num = i + 1;
            System.out.println("Number " + num + ": " + arrDyn[i]);
        }
        System.out.println("\nThanks for using my program");


    }
}
