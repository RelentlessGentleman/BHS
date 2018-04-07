import java.util.Scanner;


public class Project7_5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n1Input;
		int n2Input;
		int n1;
		int n2;
		int n3;
		int GCD;
		int placeHolder = 0;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter your first number");
		n1Input = keyboard.nextInt();
		System.out.println("Enter your second number");
		n2Input = keyboard.nextInt();
		
		n1 = n1Input;
		n2 = n2Input;
		
		while (n2 != 0)
		{
			placeHolder = n1 % n2;
			n1 = n2;
			n2 = placeHolder;
			if (placeHolder != 0)
			{
			System.out.println(placeHolder);
			}
		}
		System.out.println();
		System.out.println(n1 + " << This is your GCF for the numbers: " + n1Input + " and " + n2Input);

	}

}
