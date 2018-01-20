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
				"Please enter your favorite color from ROYGBIV using the full word.  Type 'help' for examples.");
		String favoriteColor = input.nextLine();
		if (favoriteColor.equalsIgnoreCase("help")) {
			System.out.println(
					"R is Red\nO is Orange\nY is Yellow\nG is Green\nB is Blue\nI is Indigo\nV is Violet\nNow please enter your favorite color.");
		}
		favoriteColor = input.nextLine();
		{
			if (favoriteColor.equalsIgnoreCase("red")) {
			} else if (favoriteColor.equalsIgnoreCase("orange")) {
			} else if (favoriteColor.equalsIgnoreCase("yellow")) {
			} else if (favoriteColor.equalsIgnoreCase("green")) {
			} else if (favoriteColor.equalsIgnoreCase("blue")) {
			} else if (favoriteColor.equalsIgnoreCase("indigo")) {
			} else if (favoriteColor.equalsIgnoreCase("violet"))
				;

			System.out.println("How many siblings do you have?");
			int siblings = input.nextInt();

			String retirement=input.nextLine();
			if (age % 2 == 0) {
				retirement = "20";
			} else if (!(age % 2 == 0)) {
				retirement = "45";
			}

			String vacation =null;
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
				vacation = "Russia";
			}

			String transportation = null;
			switch (favoriteColor.toLowerCase()) {
			case "r":
				transportation = "camel";
				break;
			case "o":
				transportation = "bat";
				break;
			case "y":
				transportation = "bear";
				break;
			case "g":
				transportation = "bull";
				break;
			case "b":
				transportation = "dog";
				break;
			case "i":
				transportation = "cat";
				break;
			case "v":
				transportation = "horse";
				break;
			}

			String bankAmount = null;
			if (birthMonth >= 0 && birthMonth <= 4) {
				bankAmount = "$1,000";
										
			} else if (birthMonth >= 5 && birthMonth <= 8) {
				bankAmount = "99,999,999.99";
			} else if (birthMonth >= 9 && birthMonth <= 12) {
				bankAmount = "0.99";
			} else if (birthMonth < 0 && birthMonth > 12) {
				bankAmount = "broke";
		} else {}
		
System.out.println(firstName + " " + lastName + " will retire in " + retirement + " with " + bankAmount + " in the bank, a vacation home in " + vacation + ", and travel by" + transportation + ".");

		}}}	
