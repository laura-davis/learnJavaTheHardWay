package CaesarCipher;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CaesarCipher {
    /**
     * Returns the character shifted by the given number of letters
     */
    public static char shiftLetter(char c, int n) {
        int u = c;

        if (!Character.isLetter(c))
            return c;

        u = u + n;

        if (Character.isUpperCase(c) && u > 'Z' ||
                Character.isLowerCase(c) && u > 'z') {
            u -= 26;
        }
        if (Character.isUpperCase(c) && u < 'A' ||
                Character.isLowerCase(c) && u < 'a') {
            u += 26;
        }
        return (char) u;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner file = new Scanner(new File("/Users/lda49/Projects/learnJavaTheHardWay/src/CaesarCipher/input.txt"));
        String plaintext, cipher = "";
        String outputFile;
        Scanner keyboard = new Scanner(System.in);
        int shift;

//        System.out.print("Message: ");
        plaintext = file.nextLine();
        System.out.print("Shift (0 - 26): ");
        shift = keyboard.nextInt();

        for(int i = 0; i<plaintext.length(); i++) {
            cipher += shiftLetter(plaintext.charAt(i), shift);
        }
        System.out.print("Name of output file: ");
        outputFile = keyboard.next();

        PrintWriter writer = new PrintWriter("/Users/lda49/Projects/learnJavaTheHardWay/src/CaesarCipher/" + outputFile + ".txt");
        writer.println(cipher);
        writer.close();
    }
}