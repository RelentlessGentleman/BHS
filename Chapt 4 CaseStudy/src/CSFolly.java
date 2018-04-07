import java.util.Scanner;
import java.util.Random;

public class CSFolly {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		Random generator = new Random();
		
		int die1, die2,
		dollars,
		count,
		maxDollars;
		int countAtMax;
		
		System.out.print("Enter starting Dawush: ");
		dollars = reader.nextInt();
		
		maxDollars = dollars;
		countAtMax = 0;
		count = 0;
		
		while(dollars > 0){
			count++;
			
			die1 = generator.nextInt (6) + 1;
			die2 = generator.nextInt (6) + 1;
			
			if (die1 + die2 == 7)
				dollars += 4;
			else
				dollars -= 1;
			
			if (dollars > maxDollars)
			{
				maxDollars = dollars;
				countAtMax = count;
			}
		}
		System.out.println
		("You are broke after " + count + " rolls.\n" +
		"You should have quit after " + countAtMax + " rolls when you had $" + maxDollars + ".");

	}

}
