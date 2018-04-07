


public class Q3Sub {
	
	private static double TotalRain;
	public static double avgRain;
	private static int MonthCount;
	public static double SnowAmount;
	public static double SnowAverage;
	
	public Q3Sub()
	{
		TotalRain = 0;
		avgRain = 0;
		MonthCount = 14;

	}
	
	public static void setAvgRain (double totRainFall)
	{
		TotalRain = totRainFall;
		
	}
	
	public static double getAvgRain()
	{
		double avgRainFall = TotalRain / MonthCount;
		return avgRainFall;
	}

}