import java.util.Scanner;


public class Project3_5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		double totalPay;
		double hourPay;
		double hours;
		double wooHoo;
		double placeHold;
		double overTimeCash;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Monday");
		System.out.println("Input your hourly pay: ");
		hourPay = keyboard.nextDouble();
		
		System.out.println("Input your normal hours worked: ");
		hours = keyboard.nextDouble();
		
		System.out.println("Finaly your over time hours worked: ");
		wooHoo = keyboard.nextDouble();
		
		wooHoo = wooHoo * hourPay;
		overTimeCash = wooHoo * 1.5;
		placeHold = hourPay * hours;
		totalPay = overTimeCash + placeHold;
		System.out.println("Your total pay will be: $"+totalPay);
		
		System.out.println("Tuesday");
		System.out.println("Input your normal hours worked: ");
		hours = keyboard.nextDouble();
		
		System.out.println("Finaly your over time hours worked: ");
		wooHoo = keyboard.nextDouble();
		
		wooHoo = wooHoo * hourPay;
		overTimeCash = wooHoo * 1.5;
		placeHold = hourPay * hours;
		totalPay = overTimeCash + placeHold + totalPay;
		System.out.println("Your total pay will be: $"+totalPay);
		
		
		System.out.println("Wednsday");
		System.out.println("Input your normal hours worked: ");
		hours = keyboard.nextDouble();
		
		System.out.println("Finaly your over time hours worked: ");
		wooHoo = keyboard.nextDouble();
		
		wooHoo = wooHoo * hourPay;
		overTimeCash = wooHoo * 1.5;
		placeHold = hourPay * hours;
		totalPay = overTimeCash + placeHold + totalPay;
		System.out.println("Your total pay will be: $"+totalPay);
		
		System.out.println("Thursday");
		System.out.println("Input your normal hours worked: ");
		hours = keyboard.nextDouble();
		
		System.out.println("Finaly your over time hours worked: ");
		wooHoo = keyboard.nextDouble();
		
		wooHoo = wooHoo * hourPay;
		overTimeCash = wooHoo * 1.5;
		placeHold = hourPay * hours;
		totalPay = overTimeCash + placeHold + totalPay;
		System.out.println("Your total pay will be: $"+totalPay);
		
		
		System.out.println("Friday");
		System.out.println("Input your normal hours worked: ");
		hours = keyboard.nextDouble();
		
		System.out.println("Finaly your over time hours worked: ");
		wooHoo = keyboard.nextDouble();
		
		wooHoo = wooHoo * hourPay;
		overTimeCash = wooHoo * 1.5;
		placeHold = hourPay * hours;
		totalPay = overTimeCash + placeHold + totalPay;
		System.out.println("Your total pay will be: $"+totalPay);


	}

}
