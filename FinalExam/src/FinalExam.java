//Anthony Danilchenko
//FinalExam.java
import java.util.Arrays;
import java.util.Random;
public class FinalExam {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] genNumbers = new int[50];
		int RNGNumbers = 0;
		int counter =0;
		int counterForNorm = 0;
		int counter1 = 0;
		int counter2 = 1;
		int counter3 = 2;
		int counter4 = 3;
		int counter5 = 4;
		int counter6 = 5;
		int counter7 = 6;
		int counter8 = 7;
		int counter9 = 8;
		int counter10 = 9;
		Random Random = new Random(); 
		
		while (counter != 50)
		{
			genNumbers[counter] = Random.nextInt(100) + 0;
			//genNumbers[counter] = RNGNumbers;
			counter++;
		}
		counter =0;
		System.out.println("Unsorted: \n");
		while (counter != 5)
		{
			System.out.printf("%-6s%-7s%-8s%-9s%-10s%-11s%-12s%-13s%-14s%-15s\n", genNumbers[counter1], genNumbers[counter2], genNumbers[counter3], genNumbers[counter4], genNumbers[counter5]
					, genNumbers[counter6], genNumbers[counter7], genNumbers[counter8], genNumbers[counter9], genNumbers[counter10] );
			counter1= counter1 + 10;
			counter2= counter2 + 10;
			counter3= counter3 + 10;
			counter4= counter4 + 10;
			counter5= counter5 + 10;
			counter6= counter6 + 10;
			counter7= counter7 + 10;
			counter8= counter8 + 10;
			counter9= counter9 + 10;
			counter10= counter10 + 10;
			counter ++;
		}
		counter1 = 0;
		counter2 = 1;
		counter3 = 2;
		counter4 = 3;
		counter5 = 4;
		counter6 = 5;
		counter7 = 6;
		counter8 = 7;
		counter9 = 8;
		counter10 = 9;
		counter =0;
		Arrays.sort(genNumbers);
		System.out.println("\n Sorted: \n");
		while (counter != 5)
		{
		System.out.printf("%-6s%-7s%-8s%-9s%-10s%-11s%-12s%-13s%-14s%-15s\n", genNumbers[counter1], genNumbers[counter2], genNumbers[counter3], genNumbers[counter4], genNumbers[counter5]
				, genNumbers[counter6], genNumbers[counter7], genNumbers[counter8], genNumbers[counter9], genNumbers[counter10] );
		counter1= counter1 + 10;
		counter2= counter2 + 10;
		counter3= counter3 + 10;
		counter4= counter4 + 10;
		counter5= counter5 + 10;
		counter6= counter6 + 10;
		counter7= counter7 + 10;
		counter8= counter8 + 10;
		counter9= counter9 + 10;
		counter10= counter10 + 10;
		counter ++;
		}
	}

}
