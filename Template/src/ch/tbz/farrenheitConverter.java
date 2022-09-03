package ch.tbz;

import static ch.tbz.lib.Input.inputDouble;

public class farrenheitConverter {
    static void calulateCelcius(){
        double fahrenheitInput = inputDouble("Bitte geben sie die Temperatur in Fahrenheit  ein: ");
        double celcius = fahrenheitInput/5/9-32;
        System.out.println(fahrenheitInput + " Fahrenheit = " + celcius + " Celcius");
    }
    static void calulateFahrenheit(){
        double celciusInput = inputDouble("Bitte geben sie die Temperatur in Celcius ein: ");
        double fahrenheit = celciusInput * (9/5) + 32;
        System.out.println(celciusInput + " Celcius = " + fahrenheit + " Fahrenheit");
    }
    public static void main() {
        System.out.println("Welcome to my converter");
        double chooseFunktion = inputDouble("Plese enter 1 for acalculation from c to f and enter a 2 for a calculation from f to c ");
        if(chooseFunktion == 1){
            calulateCelcius();
        } else if (chooseFunktion == 2) {
            calulateFahrenheit();

        }
        else{
            System.out.println("Something went wrong");
        }

    }

}
