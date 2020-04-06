package EnterPIN;

import java.util.Scanner;

public class EnterPIN {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int pin, entry;
        String password, typedPassword;

        password = "hunter2";
        pin = 12345;

        System.out.println("WELCOME TO THE BANK OF JAVA");
        System.out.print("ENTER YOUR PASSWORD: ");
        typedPassword = keyboard.next();
        while (!typedPassword.equals(password)) {
            System.out.println("\nINCORRECT PASSWORD.  TRY AGAIN.");
            System.out.print("ENTER YOUR PASSWORD: ");
            typedPassword = keyboard.next();
        }
        System.out.print("ENTER YOUR PIN: ");
        entry = keyboard.nextInt();

        while (entry != pin) {
            System.out.println("\nINCORRECT PIN.  TRY AGAIN.");
            System.out.print("ENTER YOUR PIN: ");
            entry = keyboard.nextInt();
        }
        System.out.println("\nPIN ACCEPTED.  YOUR BALANCE IS $425.17");
    }
}
