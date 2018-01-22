import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter your first name.");
		String firstName = input.nextLine();
		System.out.println("Please enter your last name.");
		String lastName = input.nextLine();
		System.out.println("Please enter your age.");
		int age = input.nextInt();
		System.out.println("Please enter your birth month in numeric form.");
		int birthMonth = input.nextInt();
		System.out.println(
				"Please enter your favorite color from ROYGBIV using the full word.\nType 'help' for examples.");
		String favoriteColor = input.next();
		if (favoriteColor.equalsIgnoreCase("help")) {
			System.out.println(
					"Please enter your favorite color from the following list:\nRed\nOrange\nYellow\nGreen\nBlue\nIndigo\nViolet");
			favoriteColor = input.next();
		}

		System.out.println("How many siblings do you have?");
		int siblings = input.nextInt();

		String retirement = input.nextLine();
		if (age % 2 == 0) {
			retirement = "5";
		} else if (!(age % 2 == 0)) {
			retirement = "409";
		}

		String vacation = null;
		if (siblings == 0) {
			vacation = "The Cayman Islands";
		} else if (siblings == 1) {
			vacation = "Denver, Colorado";
		} else if (siblings == 2) {
			vacation = "Melbourne, Austrlia";
		} else if (siblings == 3) {
			vacation = "Tuscany, Italy";
		} else if (siblings > 3) {
			vacation = "Kona, Hawaii";
		} else if (siblings < 0) {
			vacation = "Spitsbergen, Norway";
		}

		String transportation = null;
		switch (favoriteColor.toLowerCase()) {
		case "red":
			transportation = "camel";
			break;
		case "orange":
			transportation = "helicopter";
			break;
		case "yellow":
			transportation = "chauffeur";
			break;
		case "green":
			transportation = "minivan";
			break;
		case "blue":
			transportation = "public transportation";
			break;
		case "indigo":
			transportation = "cat";
			break;
		case "violet":
			transportation = "a hoverboard that actually hovers";
			break;
		}

		String bankAmount = null;
		if (birthMonth >= 0 && birthMonth <= 4) {
			bankAmount = "$825,000";

		} else if (birthMonth >= 5 && birthMonth <= 8) {
			bankAmount = "$99,999,999.99";
		} else if (birthMonth >= 9 && birthMonth <= 12) {
			bankAmount = "$19,999.37";
		} else if (birthMonth < 0 || birthMonth > 12) {
			bankAmount = "nothing";
		} else {
		}
		System.out.println(firstName + " " + lastName + " will retire in " + retirement + " years with " + bankAmount
				+ " in the bank, a vacation home in " + vacation + ", and travel by " + transportation + ".");

	}
}
