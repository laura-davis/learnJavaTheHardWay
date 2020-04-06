package Sequencing;

import java.util.Scanner;

public class Sequencing {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		double price, salesTax, total;

		System.out.print("How much is the purchase price? ");
		price = keyboard.nextDouble();

		salesTax = price * 0.0825;
		total = price + salesTax;

		System.out.println("Item price:\t" + price);
		System.out.println("Sales tax:\t" + salesTax);
		System.out.println("Total cost:\t" + total);

	}
}

// removing the 0 against price means that the code doesn't compile
// as sales tax cant be initialised
// when the variables are initialised after price has been entered, it compiles
// if you remove the 0 against price, the code still works
// as price is initialised on line 10
