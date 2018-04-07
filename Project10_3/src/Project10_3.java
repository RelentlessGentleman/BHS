
public class Project10_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] starter = {5, 7, 6, 9, 10};
		int[] setter = new int[10];
		int counterCheck = 1;
		int counterPlace = 0;
		int counter = 0;
		int counter2 = 1;
		
		while(counter !=4)
		{
			while(counter2 != 5)
			{
				if(starter[counter] < starter[counter2])
				{
					setter[counterPlace] = starter[counter];
					counterPlace++;
				}
				else
				{
					setter[counterPlace] = starter[counter2];
					counterPlace++;
				}
				
				counter2++;
				counter++;
			}
			//counterCheck++;
			counter++;
		}
		System.out.println(setter[0]);
		System.out.println(setter[1]);
		System.out.println(setter[2]);
		System.out.println(setter[3]);
		System.out.println(setter[4]);

	}

}
