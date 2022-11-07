package ch.tbz;

import java.util.Objects;

import static ch.tbz.lib.Input.*;

class score {
    //class for score
    int score = 0;
}
public class mathTester {
    static void finish() {
        //finish programm
        //TODO add final score output
        System.out.println("Thank you for using my Number guesser.");
    }

    static void testAgain() {
        //ask if user wants to do it again
        System.out.println("Do you want to test your skills gain?");
        String askAgain = inputString("Yes or No: ").toLowerCase();

        if (Objects.equals(askAgain, "yes")) {
            mainMenu();
        } else if (Objects.equals(askAgain, "no")) {
            finish();
        } else {
            System.out.println("You didn't enter a valid input");
        }
    }

    public static int addition() {
        //addition
        float firstNumber = (float) Math.floor(Math.random() * (100.11) + 1);
        float secondNumber = (float) Math.floor(Math.random() * (100.11) + 1);
        float result = firstNumber + secondNumber;

        System.out.println(firstNumber + " + " + secondNumber);
        double userInput = inputDouble("Enter result: ");
        if (userInput == result) {
            System.out.println("Nice Job you enterd the correct Number");
            return 1;
        } else {
            System.out.println("WRONG: The result was: " + result);
            return 0;
        }
    }
    public static int suptraction() {
        //suptraction
        int firstNumber = (int) Math.floor(Math.random() * (100) + 50);
        int secondNumber = (int) Math.floor(Math.random() * (49) + 1);
        int result = firstNumber - secondNumber;

        System.out.println(firstNumber + " - " + secondNumber);
        double userInput = inputDouble("Enter result: ");
        if (userInput == result) {
            System.out.println("Nice Job you enterd the correct Number");
            return 1;
        } else {
            System.out.println("WRONG: The result was: " + result);
            return 0;
        }
    }
    public static int multiplication() {
        //multiplication
        int firstNumber = (int) Math.floor(Math.random() * (10) + 1);
        int secondNumber = (int) Math.floor(Math.random() * (10) + 0);
        int result = firstNumber * secondNumber;

        System.out.println(firstNumber + " * " + secondNumber);
        double userInput = inputDouble("Enter result: ");
        if (userInput == result) {
            System.out.println("Nice Job you enterd the correct Number");
            return 1;
        } else {
            System.out.println("WRONG: The result was: " + result);
            return 0;
        }
    }
    static void mainMenu() {
        System.out.println("Hi, welcome to my math course");
        score myScore = new score();

        String chooseFeature = inputString("What do you want to train? +, - or *: ");
        int repete = inputInt("How many questions to you want?: ");
        //use certain feature and loop throw
        if (Objects.equals(chooseFeature, "+")) {
            for (int i = 0; i < repete; i++) {
                int result = addition();
                myScore.score += result;
            }
            testAgain();
        } else if (Objects.equals(chooseFeature, "-")) {
            for (int i = 0; i < repete; i++) {
                int result = suptraction();
                myScore.score += result;
            }
            testAgain();
        } else if (Objects.equals(chooseFeature, "*")) {
            for (int i = 0; i < repete; i++) {
                int result = multiplication();
                myScore.score += result;
            }
            testAgain();
        } else {
            System.out.println("You didn't enter a valid input");
        }
    }
    public static void main() {
        //launch menu
        mainMenu();
    }
}
