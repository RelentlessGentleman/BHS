import java.util.Scanner;


public class main_pg8_4 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter initial price.");
		double price= keyboard.nextDouble();
//		price = 500;System.out.println("500");
		double oj_price = price;
		int month;
		double total_balance_owed;
		double down_payment = .10 * price;//System.out.println("down payment : "+ down_payment);
		price = price - down_payment;//System.out.println("price"+ price);
		
//		System.out.printf("%-10s%,10.2f\n", "Price", 10000.5);
//		System.out.printf("%10d%14d\n", 45, 632);
//		System.out.printf("%10d%14d", 4545, 63278987);
		int x = 1;
		double principle = 0; //money accumulated from intetst rate;
		double interest = .01;
		double payment = .05 * (oj_price - down_payment); // payment due for month;
		double balance; //money after everything is paid
		System.out.printf("%-5s%14s%16s%16s%19s%19s\n", "Month", "balance owed", "Interest owed", "Principle due", "Payment for month", "balance remaining" );
		while(price > 0){
			principle = (principle)+((price + principle) * interest);
			System.out.printf("%-5d%,14.2f%,16.2f%,16.2f%,19.2f%,19.2f\n", x, price + principle, 1.01 * (price + principle), price, payment, (price+ principle)-payment );
			price = (price+ principle)-payment;
			principle = 0;
			x++;
			if(price < 0){
				System.out.println("Transaction finsiehd, thank you for the money");
			}
		}
	}
}
