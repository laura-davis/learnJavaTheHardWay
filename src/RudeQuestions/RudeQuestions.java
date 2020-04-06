package RudeQuestions;

import java.util.Scanner;

public class RudeQuestions {
	public static void main(String[] args) {
		String name;
		int age;
		double weight, income;
		String day;

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Hello.  What is your name? ");
		name = keyboard.next();

		System.out.print("Hi, " + name + "! How old are you? ");
		age = keyboard.nextInt();

		System.out.println("So you're " + age + ", eh?  That's not very old.");
		System.out.print("How much do you weigh, " + name + "? ");
		weight = keyboard.nextDouble();

		System.out.println(weight + "!  Better keep that quiet!!");
		System.out.print("Finally, what's your income, " + name + "? ");
		income = keyboard.nextDouble();

		System.out.print("Hopefully that is " + income + " per hour");
		System.out.println(" and not per year!");
		System.out.print("Well, thanks for answering my rude questions, ");
		System.out.println(name + ".");

		System.out.print("What day of the week is it? ");
		day = keyboard.next();
		System.out.println("Have a nice " + day + ", " + name + "!");
	}
}

// it doesn't blow up if you type an int instead of a double
// this is because an int can be cast to a double
// it doesn't blow up if you type an int or a double instead of a String
// this is because numbers can be cast to Strings
// i managed to get every line apart from the first (String) to blow up
// by typing a value that was not compatible with the declared type
