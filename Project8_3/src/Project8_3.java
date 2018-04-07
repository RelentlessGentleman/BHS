
public class Project8_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double money = 500;
		double rate = 10;
		double years = 20;
		int compPeriod = 4;
		int counter = 0;
		
		while (counter != years*compPeriod)
		{
			money = money * (1+ (rate/compPeriod/100));
			System.out.println(money+"$ after "+counter+" Periods");
			counter++;
		}
		System.out.println("Your final money is now: $"+money);

	}

}
