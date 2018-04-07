import java.util.Random;

import java.util.Scanner;


public class Project7_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int highGuess = 100;
		int lowGuess = 1;
		int computerGuess = 0;
		int inputNum;
		int counter = 0;
		int avg;
		String ask;
		Random generator = new Random();
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Input a number for the computer to guess");
		inputNum = keyboard.nextInt();
		while (inputNum != computerGuess)
		{
			computerGuess = generator.nextInt (highGuess - lowGuess) + lowGuess;

			System.out.println("Is " + computerGuess +" your number?");
			counter++;
			if (computerGuess > inputNum)
			{
				System.out.println("Try Lower");
				highGuess = computerGuess;
			}
			else if (computerGuess < inputNum)
			{
				System.out.println("Try Higher");
				lowGuess = computerGuess;
			}
			
		
		}
		System.out.println("The computer found out that your number is "+computerGuess+" in " + counter + " guesses!");
		

	}

}
