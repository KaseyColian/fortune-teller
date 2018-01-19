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
		if (birthMonth > 12 | birthMonth <= 0)
		{
			System.out.println("Please enter a month from 1-12.");
			input.next();

		}
		else if (birthMonth < 12 && birthMonth > 0); input.next();

		System.out.println("Please enter your favorite color from ROYGBIV.  Type 'help' for examples.");
		String color = input.nextLine();
		if (color.contains("help")) {
			System.out.println("R is Red" + "O is Orange" + "Y is Yellow");
		}

	}

}
