import java.util.Scanner;


public class FBIAgentProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] names = {"Bowman","Walker","Christian","Edwards","Cummings","Halpern","Scott","Rhineheart","Haley","Brooks"};
		String[] address = {"Canaan","Newark","Hardwick","Montgomery","Trenton","Liverpool","Sheridan","Houston","Westfield","Syosset"};
		String[] state = {"CT","NJ","VT","AL","NJ","NY","WY","TX","NJ","NY"};
		String[] sex = {"M","F","M","M","M","F","M","F","F","M"};
		int[] age = {48, 39, 46, 71, 31, 38, 51, 62, 22, 32};
		int[] salary = {18000, 27000, 59000, 78000, 25000, 45000, 19000, 91000, 33000, 40000};
		int[] savings = {4200, 3600, 1900, 500, 7800, 12000, 400, 53200, 4700, 3900};
		String[] Car = {"Saturn","Olds","Chev","Chev","Ford","Chev","Ford","Cad","Honda","Ford"};
		int[] years = {1999, 2000, 2001, 2003, 2004, 2002, 2006, 2005, 2002, 2004};
		int counter = 0;
		int request;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Here are the cases ALL OF THEM");
		System.out.println("_________________________" + "\n");
		//request = keyboard.nextInt();
		
		
			while (counter != 10)
			{
				if (Car[counter] == "Ford" && salary[counter] >= 20000 && age[counter] >=30)
				{
					System.out.println(names[counter] +" "+ address[counter]);
				}
				counter++;
			}
			System.out.println("End of Mr. Holmes case \n");
			counter = 0;

			while (counter != 10)
			{
				if (Car[counter] == "Ford"  && savings[counter] <= 2000)
				{
					System.out.println(names[counter]);
				}
				if (Car[counter] == "Chev" && savings[counter] <= 2000)
				{
					System.out.println(names[counter]);
				}
				if (Car[counter] == "Honda" && savings[counter] <= 2000)
				{
					System.out.println(names[counter]);
				}
				counter++;
			}
			System.out.println("End of Colouseau's Case \n");
			counter = 0;

			while(counter != 10)
			{
				if (sex[counter] == "F")
				{
					System.out.println(names[counter] +" "+ Car[counter] +" "+ years[counter]);
				}
				counter++;
			}
			System.out.println("End of Simon's Case \n");
			counter = 0;
		
			while(counter != 10)
			{
				if (sex[counter] == "M" && age[counter] <= 35 && state[counter] == "NJ" && Car[counter] == "Ford")
				{
					System.out.println(names[counter]);
				}
				counter++;
			}
			System.out.println("End of the Pink Panther's Case");
		
		System.out.println("Out");

	}

}
