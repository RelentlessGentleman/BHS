import java.util.Scanner;


public class Project10_4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] input = new int[10];
		int[] checker = new int[10];
		Scanner keyboard = new Scanner(System.in);
		int showCounter = 1;
		int mode = 0;
		int counter = 0;
		int counter2 = 0;
		int modeCounter =0;
		
		while (counter != 10)
		{
			System.out.println("Input number: " + showCounter);
			input[counter] = keyboard.nextInt();
			checker[counter] = input[counter];
			//System.out.println("Holder: "+checker[counter]);
			//System.out.println("Input: "+input[counter]);
			counter++;
			showCounter++;
		}
		counter = 0;
		while (counter !=10)
		{
			//System.out.println("It reached the outer while");
			while (counter2 != 10)
			{
				if (input[counter] == checker[counter2])
				{
					modeCounter++;
					//counter2++;
					mode = input[counter];
				}
				counter2++;
			}
			counter++;
		}
		System.out.println("The mode is: "+mode+" appered "+modeCounter+" times");
		System.out.println("it's out compleatly");
	}
}
