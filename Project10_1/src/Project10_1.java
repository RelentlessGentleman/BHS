import java.util.Scanner;


public class Project10_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] input = new int[10];
		int[] Even = new int[10];
		int[] Odd = new int[10];
		int[] Pos = new int[10];
		int[] Neg = new int[10];
		int nCounter = 0;
		int pCounter = 0;
		int eCounter = 0;
		int oCounter = 0;
		int counter = 0;
		int showCounter = 1;
		int counter2 = 0;
		
		Scanner keyboard = new Scanner(System.in);
		while (counter != 10)
		{
			System.out.println("Input number: " + showCounter);
			input[counter] = keyboard.nextInt();
			
			if (input[counter] < 0)
			{
				Neg[nCounter] = input[counter];
				nCounter++;
			}
			
			if (input[counter] > 0)
			{
				Pos[pCounter] = input[counter];
				pCounter++;
			}
			
			if (input[counter] % 2 == 0)
			{
				Even[eCounter] = input[counter];
				eCounter++;
			}
			
			if (input[counter ] % 2 != 0)
			{
				Odd[oCounter] = input[counter];
				oCounter++;
			}
			
			counter++;
			showCounter++;
		}
		
		/*while (counter2 != 10)
			{
			System.out.println("Negative Number: " + Neg[counter2]);
			System.out.println("Positive Number: "+Pos[counter2]);
			System.out.println("Odd Number: "+Odd[counter2]);
			System.out.println("Even Number: "+Even[counter2]);
			counter2++;
			}*/
		
		System.out.println("Negative Numbers: ");
		while (counter2 != nCounter)
		{
			System.out.print(" "+Neg[counter2]+ " ");
			counter2++;
		}
		counter2 = 0;
		System.out.println();
		
		System.out.println("Positive Numbers: ");
		while (counter2 != pCounter)
		{
			System.out.print(" "+Pos[counter2]+ " ");
			counter2++;
		}
		counter2 = 0;
		System.out.println();
		
		System.out.println("Odd Numbers: ");
		while (counter2 != oCounter)
		{
			System.out.print(" "+Odd[counter2]+ " ");
			counter2++;
		}
		counter2 = 0;
		System.out.println();

		System.out.println("Even Numbers: ");
		while (counter2 != eCounter)
		{
			System.out.print(" "+Even[counter2]+ " ");
			counter2++;
		}
		counter2 = 0;
		System.out.println();
		
		System.out.println("Original Numbers: ");
		while (counter2 != counter)
		{
			System.out.print(" "+input[counter2]+ " ");
			counter2++;
		}
		counter2 = 0;
		System.out.println();
		//System.out.println(Neg[0]);
		//System.out.println(input[9]);

	}

}
