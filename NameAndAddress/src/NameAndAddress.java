/**
 * @author Anthony Danilchenko
 * @program NameAndAdress.java
 * @programDescription Get user info and concatenate it and print it out
 * @date Sept. 24 2013
 */

import java.util.Scanner;
public class NameAndAddress {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		//declare variables
		String firstN, lastN, street, town, state, fullN;
		String fullAdd;
		int houseNum, ZIP;
		Scanner reader = new Scanner(System.in);
		
		//get the users name
		System.out.println("What is your name?");
		firstN = reader.nextLine();
		
		// get the users last name
		System.out.println("Thank you, now your last name:");
		lastN = reader.nextLine();
		
		// get a full name together
		fullN = firstN + " " + lastN;
		
		//get the users house number
		System.out.println("House numbah?");
		houseNum = reader.nextInt();
		reader.nextLine();
		
		//get the street name
		System.out.println("Along with your street name!");
		street = reader.nextLine();
		
		// get the town
		System.out.println("Almost hacked into your house just need the town");
		town = reader.nextLine();
		
		// get the state
		System.out.println("The two letters for your state as well:");
		state = reader.nextLine();
		
		// get the ZIP code
		System.out.println("Finally your Zip code for your ''surprise''!");
		ZIP = reader.nextInt();
		
		// put together the info
		fullAdd = street +" "+ town +", "+ state;
		
		// print out all of the info
		System.out.println(fullN);
		System.out.println(houseNum +" "+ fullAdd +" "+ ZIP);
		
		

	}

}
