package ch.tbz;
import java.util.Objects;
import java.util.Scanner;
import static ch.tbz.lib.Input.*;
import java.util.ArrayList;


public class D4 {
    public static void printFriend(ArrayList<String> arrFriends){
        System.out.println("Your friends:");
        for (int i = 0; i < arrFriends.size(); i++) {
            int friendCount = i +1;
            System.out.println(friendCount + ". " + arrFriends.get(i));
        }
    }
    public static void main() {
        System.out.println("Welcome to my friends list program?");
        System.out.println("How many friends do you want to add?");
        int friends = inputInt("Enter friends count:");
        if(friends > 0){
            ArrayList<String> arrFriends = new ArrayList<String>();
            for(int i = 0; i < friends; i++){
                int friendCount = i +1;
                String friendName = inputString("Enter your "+friendCount+". friend's Name:");
                arrFriends.add(friendName);
            }
            printFriend(arrFriends);
            System.out.println("Thank you for using my Number guesser.");
        }
        else{
            System.out.println("Please enter a valid Input");
        }


    }
}
