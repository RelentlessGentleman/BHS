
public class RainMain {
	
	public static void main(String[] args) {
		// add all in another method
		// convert in the other method as well
		double[] rainFall = {3.03, 2.65, 3.79, 3.56, 3.71, 3.43, 4.35, 3.50, 3.78, 3.18, 2.99, 3.56};
		String[] Months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		int counter = 0;
		double totRainFall = 0;
		double highestRain = 0;
		String highRainMonth = null;
		double leastRain = 7;
		String leastRainMonth = null;
		RainSub avgDiv = new RainSub();
		double snowTot = 0;
		double snowAvg = 0;
		
		
		// get total rainfall of 12 months
		while (counter != 12)
		{
			totRainFall = totRainFall + rainFall[counter];
			counter++;
		}
		// print rainfall
		System.out.println("The Total Rainfall amount is: "+totRainFall+" Inches");
		// send to RainSub and get average
		RainSub.setAvgRain(totRainFall);
		System.out.println("The average rainfall per Month is: "+RainSub.getAvgRain()+" Inches" );
		System.out.println("__________________________________________________________________________");
		System.out.println("\t Detailed Description:");
		System.out.println();
		counter = 0;
		
		// get the months and inches printed
		while (counter != 12)
		{
			System.out.println(Months[counter]+ ": " + rainFall[counter] + " in.");
			counter++;
		}
		// get the least Rain
		counter = 0;
		while(counter !=12)
		{
			if (rainFall[counter] <= leastRain)
			{
				 leastRain = rainFall[counter];
				 leastRainMonth = Months[counter];
			}
			counter ++;
		}
		
		//Get the highest Rain
		counter = 0;
		while(counter != 12)
		{
			if (rainFall[counter] >= highestRain)
			{
				highestRain = rainFall[counter];
				highRainMonth = Months[counter];
			}
			counter++;
		}
		System.out.println("__________________________________________________________________________");
		System.out.println("\t High Scores!:");
		System.out.println();
		
		// Print them out
		System.out.println(highRainMonth +" had the HIGHEST amount of rain fall with: "+ highestRain+" Inches!");
		System.out.println(leastRainMonth +" had the LEAST amount of rain fall with: "+ leastRain+" Inches!");
		System.out.println("__________________________________________________________________________");
		System.out.println("\t Snow Conversions!:");
		System.out.println();
		
		//Return the snow and print it Total
		RainSub.setSnowTot(totRainFall);
		snowTot = RainSub.getSnowTot();
		System.out.println("The Total Snow equivalent will be: "+RainSub.getSnowTot()+" Inches of Snow.");
		
		//Return the snow and print it Average
		RainSub.setSnowAvg(snowTot);
		snowAvg = RainSub.getSnowAvg();
		System.out.println("The Average Snow equivalent will be: " + RainSub.getSnowAvg()+" Inches of Snow");
		
		
		
	}

}
