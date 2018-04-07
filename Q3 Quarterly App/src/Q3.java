
public class Q3 {
	
	public static void main(String[] args) {
		// add all in another method
		// convert in the other method as well
		double[] rainFall = {-2.8, -8.8, 2.3, 7.9, 4.1, -1.4, 11.3, 10.4, 8.9, -1.2, -5.1, 2, 5.2, 2.1, 0, 0};
		double[] sort = new double[15];
		int counter = 0;
		int sortcounter = 0;
		double totRainFall = 0;
		double highestRain = 0;
		double leastRain = 7;
		Q3Sub avgDiv = new Q3Sub();
		
		
		counter = 0;
		// get total of 14 numbers
		while (counter != 14)
		{
			totRainFall = totRainFall + rainFall[counter];
			counter++;
		}
		// print total
		System.out.println("The SUM is: "+totRainFall);
		// send to numbers and get average
		Q3Sub.setAvgRain(totRainFall);
		System.out.println("The average is: "+Q3Sub.getAvgRain());
		System.out.println("__________________________________________________________________________");
		System.out.println("\t ''Sorted''");
		System.out.println();
		counter = 0;
		
		// get the numbers printed
		while (counter != 14)
		{	
			System.out.println(rainFall[counter]);
			counter++;
		}
		// get the least number
		counter = 0;
		while(counter !=14)
		{
			if (rainFall[counter] <= leastRain)
			{
				 leastRain = rainFall[counter];
			}
			counter ++;
		}
		
		//Get the highest number
		counter = 0;
		while(counter != 14)
		{
			if (rainFall[counter] >= highestRain)
			{
				highestRain = rainFall[counter];

			}
			counter++;
		}
		System.out.println("__________________________________________________________________________");
		System.out.println("\t High Scores!:");
		System.out.println();
		
		// Print them out
		System.out.println("The BIGGEST number is: "+ highestRain);
		System.out.println("The LOWEST number is "+ leastRain);

	}

}
