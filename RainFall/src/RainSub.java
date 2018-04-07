


public class RainSub {
	
	private static double TotalRain;
	public static double avgRain;
	private static int MonthCount;
	public static double SnowAmount;
	public static double SnowAverage;
	
	public RainSub()
	{
		TotalRain = 0;
		avgRain = 0;
		MonthCount = 12;
		SnowAmount = 0;
		SnowAverage = 0;
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
	public static void setSnowTot (double totRainFall)
	{
		TotalRain = totRainFall;
	}
	public static double getSnowTot()
	{
		double totSnowFall = TotalRain * 10;
		return totSnowFall;
	}
	public static void setSnowAvg (double snowTot)
	{
		SnowAmount = snowTot;
	}
	public static double getSnowAvg()
	{
		double avgSnowFall = SnowAmount / 12;
		return avgSnowFall;
	}
}