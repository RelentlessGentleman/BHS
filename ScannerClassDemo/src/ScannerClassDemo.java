/**
 * @author 14axdanilchenko
 * @program ScannerClassDemo.java
 */
// Program Name: ScannerClassDemo.java
// Program Description: This prgoram will demostrate getting input from the keyboard
// Programmer: Anthony Danilchenko
// Date: Sept. 23 2013

import java.util.Scanner;
public class ScannerClassDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		String name;	//to hold a name
		int hours;	//hours worked
		double payRate;	//hourly payrate
		double grossPay;	//gross pay
		
		// create a scanner object to read input
		Scanner keyboard = new Scanner(System.in);
		
		//get the user's name
		System.out.print("What is your name? ");
		name = keyboard.nextLine();
		
		//get the number of hours worked this week.
		System.out.print("How many hours did you work this week? ");
		hours = keyboard.nextInt();
		//get the user's hourly payrate
		System.out.print("What is your hourly payrate? ");
		payRate = keyboard.nextDouble();
		//calculate the gross pay.
		grossPay = hours * payRate;
		
		//display the resulting information
		System.out.println("Hello "+name);
		System.out.println("Your gross pay is $" + grossPay);
				
		

	}

}
