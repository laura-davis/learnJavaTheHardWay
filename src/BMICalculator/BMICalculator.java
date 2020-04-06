package BMICalculator;

import java.util.Scanner;

public class BMICalculator {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double m, kg, bmi;
		int feet, in, lb;

		// System.out.print("Your height in m: ");
		// m = keyboard.nextDouble();

		// System.out.print("Your weight in kg: ");
		// kg = keyboard.nextDouble();

		// bmi = kg / (m*m);

		System.out.print("Your height (feet only): ");
		feet = keyboard.nextInt();
		m = feet * 0.3048;

		System.out.print("Your height (inches): ");
		in = keyboard.nextInt();
		m += (in * 0.0254);

		System.out.print("Your weight in pounds: ");
		lb = keyboard.nextInt();
		kg = lb * 0.453592;

		bmi = kg / (m*m);

		System.out.print("Your BMI is ");
		System.out.printf("%.2f", bmi);
		System.out.println();
	}
}