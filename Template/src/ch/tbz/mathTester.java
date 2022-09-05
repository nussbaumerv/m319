package ch.tbz;

import java.util.Objects;

import static ch.tbz.lib.Input.*;

public class mathTester {
    static void testAgain(){
        System.out.println("Do you want to test your skillsa gain?");
        String askAgain = inputString("Yes or No: ");

        if(Objects.equals(askAgain, "Yes")){
            mainMenu();
        } else if (Objects.equals(askAgain, "No")) {
            System.out.println("Okay, goodbye!");
        }
        else{
            System.out.println("You didn't enter a valid input");
        }


    }
    static void addition(){

        int firstNumber = (int)Math.floor(Math.random()*(100)+1);
        int secondNumber = (int)Math.floor(Math.random()*(100)+1);
        int result = firstNumber + secondNumber;

        System.out.println(firstNumber + " + " + secondNumber);
        double userInput = inputDouble("Enter result: ");
        if(userInput == result){
            System.out.println("Nice Job you enterd the correct Number");
        }
        else{
            System.out.println("WRONG: The result was: " + result);
        }
        testAgain();

    }
    static void suptraction(){

        int firstNumber = (int)Math.floor(Math.random()*(100)+50);
        int secondNumber = (int)Math.floor(Math.random()*(49)+1);
        int result = firstNumber - secondNumber;

        System.out.println(firstNumber + " - " + secondNumber);
        double userInput = inputDouble("Enter result: ");
        if(userInput == result){
            System.out.println("Nice Job you enterd the correct Number");
        }
        else{
            System.out.println("WRONG: The result was: " + result);
        }
        testAgain();

    }
    static void multiplication(){

        int firstNumber = (int)Math.floor(Math.random()*(10)+1);
        int secondNumber = (int)Math.floor(Math.random()*(10)+0);
        int result = firstNumber * secondNumber;

        System.out.println(firstNumber + " * " + secondNumber);
        double userInput = inputDouble("Enter result: ");
        if(userInput == result){
            System.out.println("Nice Job you enterd the correct Number");
        }
        else{
            System.out.println("WRONG: The result was: " + result);
        }
        testAgain();

    }
    static void mainMenu(){
        System.out.println("Hi");
        String chooseFeature = inputString("What do you want to train? +, - or *: ");
        if(Objects.equals(chooseFeature, "+")){
            addition();
        } else if (Objects.equals(chooseFeature, "-")) {
            suptraction();
        } else if (Objects.equals(chooseFeature, "*")) {
            multiplication();
        }
        else{
            System.out.println("You didn't enter a valid input");
        }

    }
    public static void main() {
        mainMenu();
    }
}
