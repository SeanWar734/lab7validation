import java.util.Scanner;

/**
 * 
 * @author swarc
 *
 */

public class Lab7Regex {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		System.out.print("Please enter a valid Name: ");
		String name = scnr.nextLine();

		validateName(name);
		scnr.close();

	}

	public static boolean validateName(String name) {

		// change this to pass ALL tests
		String regex = "[A-Z]{1}[a-z]{1,29}";

		if (name.matches(regex)) {
			System.out.println("Name is valid!");
			return true;
		} else {
			System.out.println("Sorry, name is not valid!");
			return false;
		}
	}

	public static boolean validateEmail(String email) {

		// change this to pass ALL tests
		String regex = "\\w{5,13}@\\w{3,10}.\\w{2,3}";

		if (email.matches(regex)) {
			System.out.println("Email is valid!");
			return true;
		} else {
			System.out.println("Sorry, email is not valid!");
			return false;
		}
	}

	public static boolean validatePhone(String phone) {

		// change this to pass ALL tests
		String regex = "\\d{3}-\\d{3}-\\d{4}";

		if (phone.matches(regex)) {
			System.out.println("Phone number is valid!");
			return true;
		} else {
			System.out.println("Sorry, phone is not valid!");
			return false;
		}
	}

	public static boolean validateDate(String date) {

		// change this to pass ALL tests
		String regex = "[0-9]{2}[/-][0-9]{2}[/-][0-9]{4}";

		if (date.matches(regex)) {
			System.out.println("Date is valid!");
			return true;
		} else {
			System.out.println("Sorry, date is not valid!");
			return false;
		}
	}

	public static boolean validateHtml(String html) {

		// change this to pass ALL tests
		String regex = "<[a-zA-Z]{1,3}[0-9]*[>][\\s]<[/][a-zA-Z]{1,3}[0-9]*>";

		if (html.matches(regex)) {
			System.out.println("HTML is valid");
			return true;
		} else {
			System.out.println("Sorry, this is not a valid HTML thing");
			return false;
		}

	}
}
