import java.util.*;


public class Project10_5 
{

	public static void main(String[] args)
	{
		int integer [] = new int[10];
		int counterArray [] = new int [10];
		int mode[] = new int [10];
		
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		
		for (int i=0; i<10; i++)
		{
			System.out.println("Enter some integer: ");
			integer[i] = keyboard.nextInt();
		}
		
		Arrays.sort(integer);
		
		System.out.print("\n");
		
		for(int i=0; i<10; i++)
		{
			for(int c=0; c<10; c++)
			{
				if(integer[i] == integer[c])
				{
					counterArray[i]++;
				}
			}
		}
		for (int i=0; i<10; i++)
		{
			if (i==0 || integer[i] !=integer [i-1])
			{
				System.out.println("The number " + integer[i] +" appears " + counterArray[i] + " times.");
			}
		}
		for(int i=0; i<10; i++)
		{
			if (counterArray [i] > mode [1])
			{
				mode[1] = counterArray [i];
			}
			else
			{
				System.out.println("\nThe mode is: " + integer[i] + " which appears " + mode[1] + " times");
				break;
			}
		}
		double middle = integer[5] - integer[4];
		double median = middle/2 + integer[4];
		System.out.println("\nThe median is: "+ median);

	}

}
