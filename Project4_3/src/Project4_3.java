// Program Name: Project4_3.java
// Program Description: get amount of minutes and output respective cost
// Programmer: Anthony Danilchenko
// Date: Oct. 9 2013

import java.util.Scanner;


public class Project4_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int minutes = 0;
		double cost = 0;
		double addCost = 0;
		System.out.println("gimmeh teh minutes");
		Scanner keyboard = new Scanner(System.in);
		minutes = keyboard.nextInt();
		if(minutes ==1)
		{
			cost = cost + .575;
		}
		else if(minutes ==2)
		{
			cost = cost + 1.15;
		}
		else if(minutes > 2)
		{
			cost = cost + 1.15;
			minutes = minutes - 2;
			addCost = .5 * minutes;
		}
		cost = cost + addCost;
		System.out.println("Your total cost will be: " +cost+"$");

	}

}
