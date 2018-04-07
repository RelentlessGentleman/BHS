import java.util.Scanner;


public class TossOPCalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int zBase;
		int pBase;
		System.out.println("Zerg:");
		System.out.println("How many bases are you on?");
		Scanner keyboard = new Scanner(System.in);
		zBase = keyboard.nextInt();
		if (zBase > 10)
		{
			System.out.println("You MIGHT be able to win!");
		}
		else 
		{
			System.out.println("Yeah GG bro");
		}
		System.out.println("Toss too imba, riot nurf");
	}

}
