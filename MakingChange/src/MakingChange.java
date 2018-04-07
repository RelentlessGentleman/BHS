// Program Name: MakingChange.java
// Program Description: Get an input of change and give out how many coins you'll get
// Programmer: Anthony Danilchenko
// Date: October 2 2013
import java.util.Scanner;
public class MakingChange {
	public static void main(String[] args) 
	{
		// Declare some Variables
		int Change;
		int placeHold = 0;
		int Quarter = 0;
		int Dime = 0;
		int Nick = 0;
		int Pen = 0;
		System.out.println("Input how much change you have (0-99 cents):");
		Scanner keyboard = new Scanner(System.in);
		Change = keyboard.nextInt();
		//run an if else for finding quarters
		if (Change >= 75)
		{
			Change = Change - 75;
			Quarter = Quarter + 3;
		}
		else if (Change >= 50)
		{
			Change = Change - 50;
			Quarter = Quarter + 2;
		}
		else if (Change >= 25)
		{
			Change = Change - 25;
			Quarter = Quarter + 1;
		}
		// run an if else for dime amounts
		if (Change >= 20)
		{
			Change = Change - 20;
			Dime = Dime + 2;
		}
		else if (Change >= 10)
		{
			Change = Change - 10;
			Dime = Dime + 1;
		}
		// Find how many nickles there are
		if (Change >= 5)
		{
			Change = Change - 5;
			Nick = Nick + 1;
		}
		// find how many pennies will be in here
		if (Change >= 4)
		{
			Change = Change - 4;
			Pen = Pen + 4;
		}
		else if (Change >= 3)
		{
			Change = Change - 3;
			Pen = Pen + 3;
		}
		else if (Change >= 2)
		{
			Change = Change - 2;
			Pen = Pen + 2;
		}
		else if (Change >= 1)
		{
			Change = Change - 1;
			Pen = Pen + 1;
		}
		// just print out the results
		//System.out.println(Change + " remaining");
		System.out.println(Quarter + " Quarters");
		System.out.println(Dime + " Dimes");
		System.out.println(Nick + " Nickles");
		System.out.println(Pen + " Pennies");

	}

}
