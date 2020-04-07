package ReceiptRevisited;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReceiptRevisited {
    public static void main(String[] args) throws Exception {
        PrintWriter fileout = new PrintWriter("receipt.txt");
        double pricePerLitre = 11.00;
        double numLitres = 0;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Gas costs £" + pricePerLitre + " per gallon.");
        System.out.print("Enter how many litres you would like? ");
        numLitres = keyboard.nextDouble();
        System.out.println("\nTotal cost: £" + pricePerLitre * numLitres);
        System.out.println("\nWriting customised receipt to \"receipt.txt\"... done.");

        fileout.println("+------------------------");
        fileout.println("|                        ");
        fileout.println("|          TESCO         ");
        fileout.println("|                        ");
        fileout.println("|  19-03-2020   04:38PM  ");
        fileout.println("|                        ");
        fileout.println("|  Litres:        " + numLitres);
        fileout.println("| Price / litre:   £" + pricePerLitre);
        fileout.println("|                        ");
        fileout.println("|   Fuel total: £" + pricePerLitre * numLitres);
        fileout.println("|                        ");
        fileout.println("+------------------------");
        fileout.close();
    }
}
