import java.util.Scanner;


public class RabbitsDoWhile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int months;
		int something = 0;
		int a = 0;
		int b = 1;
		int c = 0;
		int input;
		int PH = 1;
		Scanner keyboard = new Scanner(System.in);
		months = keyboard.nextInt();
		
		do
		{
			c = a+b;
			b=a;
			a=c;
			something++;
			System.out.println("Month "+PH+" had: "+c+" Rabbit pairs!");
			PH++;
		}while (months != something);
		System.out.println("Test");
		System.out.println();

	}

}
