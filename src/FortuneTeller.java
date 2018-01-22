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
				"Please enter your favorite color from ROYGBIV using the full word.\nType 'help' for examples then enter your favorite color.");
		String favoriteColor = input.next();
		if (favoriteColor.equalsIgnoreCase("help")) {
			System.out.println("Please type color from list:\nRed\nOrange\nYellow\nGreen\nBlue\nIndigo\nViolet");
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
			vacation = "Salem, Ohio";
		} else if (siblings == 1) {
			vacation = "Centralia, Pennsylvania";
		} else if (siblings == 2) {
			vacation = "Batesville, Indiana";
		} else if (siblings == 3) {
			vacation = "Spitsbergen, Norway";
		} else if (siblings > 3) {
			vacation = "Kona, Hawaii";
		} else if (siblings < 0) {
			vacation = "Mother Russia";
		}

		String transportation = null;
		switch (favoriteColor.toLowerCase()) {
		case "red":
			transportation = "camel";
			break;
		case "orange":
			transportation = "bat";
			break;
		case "yellow":
			transportation = "bear";
			break;
		case "green":
			transportation = "bull";
			break;
		case "blue":
			transportation = "dog";
			break;
		case "indigo":
			transportation = "cat";
			break;
		case "violet":
			transportation = "horse";
			break;
		}

		String bankAmount = null;
		if (birthMonth >= 0 && birthMonth <= 4) {
			bankAmount = "$1,000";

		} else if (birthMonth >= 5 && birthMonth <= 8) {
			bankAmount = "$99,999,999.99";
		} else if (birthMonth >= 9 && birthMonth <= 12) {
			bankAmount = "$0.99";
		} else if (birthMonth < 0 || birthMonth > 12) {
			bankAmount = "nothing";
		} else {
		}
		System.out.println(firstName + " " + lastName + " will retire in " + retirement + " years with " + bankAmount
				+ " in the bank, a vacation home in " + vacation + ", and travel by " + transportation + ".");

	}
}
