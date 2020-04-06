package ClubBouncer;

public class ClubBouncer {
	public static void main(String[] args) {
		int age = 22;
		boolean onGuestList = false;
		double allure = 7.5;
		String gender = "F";

		if (onGuestList || age >= 21 || (gender.equals("F") && allure >= 8)) {
			System.out.println("You are allowed to enter the club.");
		}
		// System.out.println("Gizmo is cool");
		else {
			System.out.println("You are not allowed to enter the club.");
		}
	}
}

// by breaking the if / else statement up, it wont run because the else cannot
// see where the statement begins