import java.util.Scanner;


public class RabbitsWhile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int months;
		int something = 0;
		int a = 0;
		int b = 1;
		int c = 0;
		int PH = 1;
		int input;
		Scanner keyboard = new Scanner(System.in);
		months = keyboard.nextInt();
		while(months != something)
		{
			c = a+b;
			b=a;
			a=c;
			something++;
			System.out.println("Month "+PH+" had: "+c+" Rabbit pairs!");
			PH++;
		}
		System.out.println("Test");
	}

}
