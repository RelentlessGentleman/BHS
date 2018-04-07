import java.util.Random;
import java.util.Scanner;


public class Project7_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int inputNum;
		int guessNum = 0;
		int counter = 0;
		Scanner keyboard = new Scanner(System.in);
		Random generator = new Random();
		inputNum = generator.nextInt (100) + 1;
		System.out.println(inputNum);
		
		while (guessNum != inputNum)
		{
			counter++;
			System.out.print("Put in a guess:");
			guessNum = keyboard.nextInt();
			//System.out.println(guessNum);
			if (guessNum > inputNum)
			{
				System.out.println("Try Lower");
			}
			else if (guessNum < inputNum)
			{
				System.out.println("Try Higher");
			}
		}
		System.out.println("Good job you guessed "+ inputNum + " and it only took you " + counter + " tries!");

	}

}
