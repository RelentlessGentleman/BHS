import java.util.Scanner;


public class Project8_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double guess = 1;
		double setNumber;
		double output;
		double holder;
		int cap;
		int counter = 0;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("The number you want to reach");
		setNumber = keyboard.nextDouble();
		System.out.println("Number of times you want to go thru");
		cap = keyboard.nextInt();
		
		while (counter != cap)
		{
			holder = guess + setNumber / guess;
			guess = holder / 2;
			counter++;
			System.out.println("Searching, we got: "+guess+"\t After "+counter+" tries.");
		}
		System.out.println(guess);
	}

}
