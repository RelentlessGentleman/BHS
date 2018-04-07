// Program Name: NautConvert.java
// Program Description: Convert Kilometers to Nautical Miles
// Programmer: Anthony Danilchenko
// Date: Sept. 26 2013

import java.util.Scanner;


public class NautConvert {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// Declare some variables
		Scanner reader = new Scanner(System.in);
		double kilometers;
		double nMiles;
		// Get input  and convert it
		System.out.print("Enter Kilometers ");
		kilometers = reader.nextDouble();
		// Do some math and output it
		nMiles = kilometers *1/10000*5400;
		System.out.print("The equivalent in Nautical Miles is ");
		System.out.println(nMiles);

	}

}
