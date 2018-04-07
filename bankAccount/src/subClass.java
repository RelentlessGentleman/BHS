public class subClass {
	
	private String name;
	private double balanceEnd;
	
	public subClass()
	{
		name = "";
		balanceEnd = 0;
	}
	public void setName (String nameMain)

	{
		name = nameMain;
	}
	public String getName()
	{
		return name;
		
	}
	
	public void setWith (double balance, double decrease)
	{
		balanceEnd = balance - decrease;
	}
	public double getWith()
	{
		return balanceEnd;
	}
	public void setDep (double balance, double increase)
	{
		balanceEnd = balance + increase;
	}
	public double getDep()
	{
		return balanceEnd;
	}

}