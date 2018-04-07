import java.util.Scanner;


public class RabbitsFor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int months;
		int a = 0;
		int b = 1;
		int c = 0;
		int PH = 1;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the amount of months");
		months = keyboard.nextInt();
		for (int something = 0; something <= months; something++)
		{
			c=a+b;
			b=a;
			a=c;
			System.out.println(c);
			System.out.println("Month "+PH+" had: "+c+" Rabbit pairs!");
			PH++;
		}
		System.out.println();

	}

}
