import java.util.Scanner;


public class ZeroSum {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		int[] input1 = new int[10];
		int[] input2 = new int[10];
		int counter1 = 0;
		int counter2 = 0;
		Scanner keyboard = new Scanner(System.in);
		
		
		while(counter1 != 10)
		{
			System.out.println("here");
			input1[counter1] = keyboard.nextInt();
			if(input1[counter1] == -999)
			{
				break;
			}
			counter1++;
		}
		counter1 = 0;
		while(counter1 != 10)
		{
			System.out.println("Here2");
			input2[counter1] = keyboard.nextInt();
			if(input2[counter1] == -999)
			{
				break;
			}
			counter1++;
		}
		System.out.println();
		counter1 = 0;
		System.out.println("List one:");
		while(counter1 != 10)
		{
			
			System.out.print(input1[counter1]+", ");
			counter1++;
		}
		System.out.println();
		counter1 = 0;
		System.out.println("List two:");
		while (counter1 != 10)
		{
			
			System.out.print(input2[counter1]+", ");
			counter1++;
		}
		System.out.println();
		counter1 = 0;
		while(counter1 != 10)
		{
			while(counter2 != 10)
			{
				if(input1[counter1] + input2[counter2] == 0)
				{
					System.out.println(input1[counter1] +" and "+ input2[counter2] + ": Will equal zero");
				}
				counter2++;
			}
			counter1++;
		}
	}
}
