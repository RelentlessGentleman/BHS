import java.io.*;
import java.util.Scanner;

public class SearchSorts
{


	public static void main(String[] args) throws IOException
	{
		Scanner Scanner = new Scanner(System.in);
		
	File file = new File("randomWords.txt");
	Scanner inputFile = new Scanner(file);
	PrintWriter outputFile = new PrintWriter("Sort of 10 words.txt");
	
	String[] list = new String[4939];
		for(int i = 0; i < 4939; i++)
		{
			list[i] = inputFile.nextLine();
		}
		bubbleSort(list);
		for(int i = 0; i < list.length; i++)
		{
			System.out.println(list[i]);
		}
		
		System.out.println("What would you like to search for? ");
		String Kappa = Scanner.nextLine();
			int holder = linearSearch(list, Kappa);
			System.out.println("Linear: "+holder);

		int bolder = binarySearch(list, Kappa);
		System.out.println("Binary: "+bolder);
	}
	public static int linearSearch(String[] a, String searchValue)
	{
		for(int i = 0; i < a.length; i++)
		{
			if(a[i].equalsIgnoreCase(searchValue))
			{
				return i;
			}
		}
		return -1;
	}
	public static int binarySearch(String[] a, String searchValue)
	{
		int left = 0;
		int right = a.length -1;
		while (left <= right)
		{
			int midpoint = (left + right) / 2;
			int result = ((Comparable)a[midpoint]).compareTo(searchValue);
			if(result == 0)
				return midpoint;
			else if (result < 0)
				left = midpoint + 1; 
			else
				right = midpoint - 1;
		}
		return -1;
	}
 
	public static void bubbleSort(String[]a)
	{
		int k = 0;
		boolean exchangeMade = true;
		
		while((k < a.length - 1) && exchangeMade)
		{
			exchangeMade = false;
			k++;
			for(int j = 0; j < a.length - k; j++)
				if (a[j].compareTo(a[j + 1]) > 0)
				{
					swap(a, j, j + 1);
					exchangeMade = true;
				}
		}
	}
	public static void swap(String[] a, int x, int y)
	{
		String temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}
}
