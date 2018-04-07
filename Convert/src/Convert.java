import java.util.Scanner;


public class Convert {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner reader = new Scanner(System.in);
		double Fah;
		double Cel;
		
		System.out.print("Enter Degrees Fahrenheit: ");
		Fah = reader.nextDouble();
		
		Cel = (Fah - 32.0) * 5.0 / 9.0;
		System.out.print("The equivalent in Celsius is ");
		System.out.println(Cel);

	}

}
