import java.io.File;
//import java.io.IOexception;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.*;
public class InputFiles {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException
	{
		int printField = 0;
		String Print;
		int counter;
		counter = 0;
		int PH1 = 0;
		int PH2 = 0;
		
		
		
		File file1 = new File("res/File1In.txt");
		Scanner Even = new Scanner(file1);
		
		File file2 = new File("res/File2In.txt");
		Scanner Odd = new Scanner(file2);
		PH1 = Even.nextInt();
		PH2 = Odd.nextInt();
		
		PrintWriter outputFile = new PrintWriter("OutputFile.txt");
		
		{do
		if (PH1 > PH2)
			{
				
				System.out.println(PH2);
				
				outputFile.println(PH2);
				PH2 = Odd.nextInt();
			}	
		else
			{
			
			System.out.println(PH1);
			outputFile.println(PH1);
			PH1 = Even.nextInt();
			}
		while (Odd.hasNext() || Even.hasNext());
		
		}
		
		while (Odd.hasNext() || Even.hasNext())
		{
			if (PH1 < PH2)
			{
				System.out.println(PH1);
				
				outputFile.println(PH1);
				
				PH1 = Even.nextInt();
				
			}
			else
			{
				
				System.out.println(PH2);
				outputFile.println(PH2);
				PH2 = Odd.nextInt();
			}
		}
		System.out.println(PH1);
		outputFile.println(PH1);
		System.out.println(PH2);
		outputFile.println(PH2);
		Even.close();
		Odd.close();
		outputFile.close();
	}

}
