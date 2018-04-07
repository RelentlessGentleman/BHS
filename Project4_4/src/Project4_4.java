// Program Name: Project4_4.java
// Program Description: Do stuff
// Programmer: Anthony Danilchenko
// Date: Oct. 09 2013

import java.util.Scanner;


public class Project4_4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter a number greater than 0:");
		int number = reader.nextInt();
		int product = 1;
		int count = 1;
		while (count <= number)
		{
			product = product * count;
			System.out.println(product);
			count++;
		}
		System.out.println("The Factorial of " + number + " is " + product);

	}

}
