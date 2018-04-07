import java.util.Scanner;


public class Average {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		double placeHolder = 0;
		double Avg;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Input your first number");
		placeHolder = placeHolder + keyboard.nextInt();
		System.out.println("Input your second number");
		placeHolder = placeHolder + keyboard.nextInt();
		System.out.println("Input your third number");
		placeHolder = placeHolder + keyboard.nextInt();
		System.out.println("Input your fourth number");
		placeHolder = placeHolder + keyboard.nextInt();
		System.out.println("Input your fifth number");
		placeHolder = placeHolder + keyboard.nextInt();
		System.out.println("Your average is going to be");
		Avg = placeHolder / 5;
		System.out.println(Avg);
	}

}
