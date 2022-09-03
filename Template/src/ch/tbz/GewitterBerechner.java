package ch.tbz;

import static ch.tbz.lib.Input.inputDouble;

public class GewitterBerechner {
    static void calc() {
        double seconds = inputDouble("Wie viele sekunden hat es bis zum knall gedauert?");

        double meters = seconds * 344;
        double km = meters / 1000;
        System.out.println("Der Blitz war " + km + " KM (" + meters + " M) von Ihnen entfernt");
    }
    public static void main() {

    calc();
    boolean stop = false;
        do {
            double check = inputDouble("Drücken sie eins um den Vorgang zu wiederholen.");
            if(check == 1) {
                calc();
            }
            else{
                stop = true;
            }
        }
        while(stop == false);
    }
}
