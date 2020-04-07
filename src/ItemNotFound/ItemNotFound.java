package ItemNotFound;

import java.util.Scanner;

public class ItemNotFound {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String[] heroes = {"Abderus", "Achilles", "Achilles", "Aeneas", "Ajax", "Ajax", "Amphitryon",
                "Bellerophon", "Castor", "Chrysippus", "Daedalus", "Diomedes",
                "Eleusis", "Eunostus", "Ganymede", "Hector", "Hector", "Iolaus", "Jason", "Jason",
                "Meleager", "Odysseus", "Orpheus", "Perseus", "Theseus"
        };
        String guess;
//        boolean found;
        int count = 0;

        System.out.println("Pop Quiz!");
        System.out.print("Name any *mortal hero from Greek mythology: ");
        guess = keyboard.next();
//        found = false;

//        for (String hero : heroes) {
//            if (guess.equals(hero)) {
//                System.out.println("That's one of them!");
//                found = true;
//            }
//        }
//        if (found == false) {
//            System.out.println("No, " + guess + " wasn't a Greek mortal hero.");
//        }
        for (String hero : heroes) {
            if (guess.equals(hero)) {
                count++;
            }
        }
        if (count > 0) {
            System.out.println("You named a hero!");
        }
        else {
            System.out.println("You didn't name any heroes :(");
        }
    }
}
