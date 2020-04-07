package ReceiptRevisitedException;

import java.io.IOException;
import java.io.PrintWriter;

public class ReceiptRevisitedException {
    public static void main(String[] args) throws Exception {
        PrintWriter fileout;


        try {
            fileout = new PrintWriter("receipt.txt");
        } catch (IOException e) {
            System.out.println("Sorry, I can't open 'receipt.txt' for writing.");
            System.out.println("Maybe the file exists and is read-only?");
            fileout = null;
            System.exit(1);
        }

        fileout.println("+------------------------+");
        fileout.println("|                        |");
        fileout.println("|          TESCO         |");
        fileout.println("|                        |");
        fileout.println("|  19-03-2020   04:38PM  |");
        fileout.println("|                        |");
        fileout.println("|  Litres:        10.00  |");
        fileout.println("| Price / litre:   £1.22 |");
        fileout.println("|                        |");
        fileout.println("|   Fuel total: £12.20   |");
        fileout.println("|                        |");
        fileout.println("+------------------------+");
        fileout.close();
    }
}
