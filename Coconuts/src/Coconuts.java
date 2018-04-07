// Program Name: Coconuts.java
// Program Description: Do the coconuts riddle
// Programmer: Anthony Danilchenko
// Date: Sept. 30 2013
import java.util.Scanner;


public class Coconuts {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double cocoPer = 0;
		double totalCoco;
		int Monkey = 1;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("How many starting coconuts?");
		totalCoco = keyboard.nextInt();
		
		cocoPer = totalCoco / 5;
		totalCoco = totalCoco - cocoPer;
		System.out.println("Sailor 1 has " + cocoPer);
		totalCoco = totalCoco - Monkey;
		
		cocoPer = totalCoco / 5;
		totalCoco = totalCoco - cocoPer;
		System.out.println("Sailor 2 has " + cocoPer);
		totalCoco = totalCoco - Monkey;
		
		cocoPer = totalCoco / 5;
		totalCoco = totalCoco - cocoPer;
		System.out.println("Sailor 3 has " + cocoPer);
		totalCoco = totalCoco - Monkey;
		
		cocoPer = totalCoco / 5;
		totalCoco = totalCoco - cocoPer;
		System.out.println("Sailor 4 has " + cocoPer);
		totalCoco = totalCoco - Monkey;
		
		cocoPer = totalCoco / 5;
		totalCoco = totalCoco - cocoPer;
		System.out.println("Sailor 5 has " + cocoPer);
		totalCoco = totalCoco - Monkey;
		
		System.out.println(totalCoco);
		totalCoco = totalCoco - Monkey;
		totalCoco = totalCoco / 5;
		System.out.println(totalCoco);

	}

}
