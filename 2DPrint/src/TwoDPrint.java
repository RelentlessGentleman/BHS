import java.util.Scanner;


public class TwoDPrint {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[][]matrix = new int[6][5];
		int counterRow = 0;
		int counterCol = 0;
		int counterTemp = 0;
		int counter = 0;
		Scanner keyboard = new Scanner(System.in);
		//matrix[0][0] = 1;
		//System.out.println(matrix[0][0]);
		while (counterRow != 3)
		{
			System.out.println("first loops");
			matrix[counterCol][counterRow] = keyboard.nextInt();
			
			while(counterCol != 3)
			{
				System.out.println("2nd loops"+counterCol);
				System.out.println(matrix[0][0]);
				System.out.println(matrix[1][0]);
				System.out.println(matrix[0][1]);
				System.out.println(matrix[0][2]);
				counterCol++;
				matrix[counterCol][counterRow] = keyboard.nextInt();
				
			}
			counterRow ++;
			counterCol = 0;
		}
		while (counter != 3)
		{
			System.out.println("output loop #" + counter);
			System.out.println("0 and " + counter);
			System.out.println(matrix[0][counter]);
			System.out.println(matrix[1][counter]);
			System.out.println(matrix[2][counter]);
			System.out.println(matrix[3][counter]);
			counter ++;
		}
			

	}

}
