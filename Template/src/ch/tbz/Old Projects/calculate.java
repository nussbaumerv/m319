package ch.tbz;

import static ch.tbz.lib.Input.inputString;

public class calculate {
        public static void main() {
            String name = inputString("Bitte geben sie ihren Namen ein: ");
            String adresse = inputString("Bitte geben sie ihre Adresse ein:");

            if(name.equals("tim")){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }

            String result = "Hi " + name + " ihre Adresse lautet: " + adresse;
            System.out.println(result);
        }
    }

