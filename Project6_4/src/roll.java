import java.util.Random;


public class roll {
	
	private int roll1;
	private int roll2;
	
	public roll()
	{
		roll1 = 0;
		roll2 = 0;
	}
	
	public void setRollRandom ()
	{
		Random generator = new Random();
		roll1 = generator.nextInt (6) + 1;
		roll2 = generator.nextInt (6) + 1;
	}
	public int getRollRandom()
	{
		int combined = roll1 + roll2;
		return combined;
	}

}
