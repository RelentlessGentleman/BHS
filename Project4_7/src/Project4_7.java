import java.util.Scanner;


public class Project4_7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int input;
		int square;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a number to be squared:");
		input = keyboard.nextInt();
		while (input >= -10)
		{
			if (input == -1) break;
			square = input * input;
			System.out.println(square);
			input = -11;
			System.out.println("Enter a number to be squared:");
			input = keyboard.nextInt();
		}
		System.out.println("You're done inputing!");
	}

}
