import java.util.Scanner;


public class Project8_4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double inputPrice;
		double firstCut;
		double totalMoney = 1000;
		double secondCut;
		int counter = 1;
		int percent;
		int number = 10;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Input your price for the thingy you want!:");
		inputPrice = keyboard.nextInt();
		
		
		firstCut = inputPrice / number;
		inputPrice = inputPrice - firstCut;
		secondCut = inputPrice / 20;
		System.out.println("Month \t balance owed \t Interest owed \t Principle due \t Payment for month \t balance remaining" );
		while(inputPrice > 0)
		{
			inputPrice = inputPrice - secondCut;
			System.out.println(counter +"\t\t" + inputPrice + "\t\t" + inputPrice*.01 + "\t\t" + inputPrice + "\t\t" + secondCut + "\t\t  " + (totalMoney=totalMoney-secondCut));
			//System.out.println("The price is $"+inputPrice+" after "+ counter+" month(s)."+"You've paid " + secondCut + " this month");
			counter++;
		}

	}

}
