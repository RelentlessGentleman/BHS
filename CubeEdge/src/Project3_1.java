// Program Name: Project3_1.java
// Program Description: Get the surface area and volume of a cube from a length
// Programmer: Anthony Danilchenko
// Date: Sept. 30 2013

import java.util.Scanner;


public class Project3_1
{
	public static void main(String[] args)
	{
		double edgeInput;
		double SFA;
		double Face;
		double Volume;
		
		System.out.println("Input the length of a side for a cube:");
		Scanner keyboard = new Scanner(System.in);
		edgeInput = keyboard.nextInt();
		Face = edgeInput * edgeInput;
		SFA = (edgeInput * edgeInput) * 6;
		System.out.println("Your cube surface area is going to be: "+ SFA);
		Volume = Face * edgeInput;
		System.out.println("Now for your Volume: " + Volume);

	}

}
