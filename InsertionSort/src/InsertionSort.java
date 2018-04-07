import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

public class InsertionSort
{

	public static void main(String[] args) throws IOException
	{
		Scanner Keyboard = new Scanner(System.in);
		
	File file = new File("InsertionSort.txt");
	Scanner inputFile = new Scanner(file);
	
	int[] list = new int[20];
		for(int i = 0; i < 20; i++)
		{
			list[i] = inputFile.nextInt();
		}
		insertionSort(list);
		for(int i = 0; i < list.length; i++)
		{
			System.out.println(list[i]);
		}
		
	
	}
	public static void insertionSort(int[] a)
	{ 
		int itemToInsert, j;
		int counter = 0;
		boolean checker;

		for (int x = 1; x < a.length; x++)
		{
			counter++;
			itemToInsert = a[x];
			j = x - 1;
			checker = true;
			
			while ((j >= 0) && checker)
				if (itemToInsert < a[j])
				{
					a[j + 1] = a[j];
					j--;
				}
				else
					checker = false;
			a[j + 1] = itemToInsert;
			System.out.println("Cycle " +counter+ ": "+Arrays.toString(a));
		}
	}	
}
