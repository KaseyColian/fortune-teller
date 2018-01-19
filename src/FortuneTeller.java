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
		input.nextLine();

		System.out.println(
				"Please enter your favorite color from ROYGBIV using the full word.  Type 'help' for examples.");

		String favoriteColor = input.nextLine();

		if (favoriteColor.equalsIgnoreCase("help")) {
			System.out.println(
					"R is Red\nO is Orange\nY is Yellow\nG is Green\nB is Blue\nI is Indigo\nV is Violet\nNow please enter your favorite color.");
		}
		favoriteColor = input.nextLine();
System.out.println("How many siblings do you have?");
int siblings = input.nextInt();
	
	String retirement;
	if (age %2==0) {
	retirement="20 years";
	}else if (!(age %2==0)){
	retirement="never";}
	
	
	System.out.println();
	}}
