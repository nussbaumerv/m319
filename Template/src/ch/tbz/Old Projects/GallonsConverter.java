package ch.tbz;

public class GallonsConverter {
    public static void main() {
        double gallons = 1;
        double litres;
        double row = 0;
        int counter = 0;

        while(gallons <= 100){
            if(row == 10){
                System.out.println();
                row = 0;
            }
            row++;
            litres = gallons / 3.7854;
            System.out.print(litres);
            System.out.print(" | ");
            gallons++;
        }
        //System.out.println(gallons + " gallons is " + litres + " litres.");

    }
}
