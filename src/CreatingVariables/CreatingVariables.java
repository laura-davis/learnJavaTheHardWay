package CreatingVariables;

public class CreatingVariables {
	public static void main(String[] args) {
		int x, y, age;
		double seconds, e, checking;
		String firstName, lastName, title;

		x = 10;
		y = 400;
		age = 39;
		seconds = 4.71;
		e = 2.7182818284590452356;
		checking = 1.89;

		firstName = "Graham";
		lastName = "Mitchell";
		title = "Mr.";

		int gizAge = 7;
		double gizWeight = 6.9;
		String gizName = "Gizmo";
		String gizNickname = "Bebo";

		System.out.println("The variable x containts " + x);
		System.out.println("The value " + y + " is stored in the variable y.");
		System.out.println("The experiment took " + seconds + " seconds.");
		System.out.println("A favourite irrational # is Euler's number " + e);
		System.out.println("Hopefully you have more than $" + checking + "!");
		System.out.println("My name's " + title + " " + firstName + " " + lastName);

		System.out.println("My dog is called " + gizName + " but we also call him " + gizNickname + ".");
		System.out.println("He is " + gizAge + " years old and weighs " + gizWeight + " kilos.");
	}
}