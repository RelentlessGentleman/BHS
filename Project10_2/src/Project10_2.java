import java.util.Scanner;


public class Project10_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double[] input = new double[10];
		int counter = 0;
		int showCounter = 1;
		Project10_2addOn average = new Project10_2addOn();
		Scanner keyboard = new Scanner(System.in);
		while (counter != 10)
		{
			System.out.println("Input number: " + showCounter);
			input[counter] = keyboard.nextDouble();
			Project10_2addOn.setAverage();
			counter++;
			showCounter++;
		}
		
		
	}

}
