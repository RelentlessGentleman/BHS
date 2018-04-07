import java.util.Scanner;


public class Project4_5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double subNum = 3;
		double addNum = 5;
		double userInput = 0;
		double placeHolder = 0;
		double placeHolder2 = 0;
		double placeHolder4 = 0;
		double placeHolder3 = 1;
		double pi = 4;
		System.out.println("Enter:");
		Scanner keyboard = new Scanner(System.in);
		userInput = keyboard.nextInt();
		// big while loop
		while (userInput >= 0)
		{
			
			// get the subbing number
			while(addNum < userInput)
			{
				
				
 				//System.out.println("add "+addNum);
				placeHolder2 = (1/addNum);
				
				//placeHolder4 = placeHolder2 + placeHolder4;
				//System.out.println("PH2 "+placeHolder2);
				addNum = addNum + 4;
				pi = pi + placeHolder2;
				//System.out.println(pi);
			}
			
			while (subNum < userInput)
			{
				
				
				//System.out.println("sub num "+subNum);
				placeHolder =  (1/subNum);
				
				//placeHolder3 = placeHolder3 - placeHolder;
				//System.out.println("placeholder "+placeHolder);
				subNum = subNum + 4;
				pi = pi - placeHolder;
				//System.out.println(pi);
			}
			
			userInput = userInput - 2;
			//System.out.println(pi);
		}
		pi = pi - .64;
		//pi = placeHolder4 + placeHolder3;
		//pi = 4 / (placeHolder4 + placeHolder3);
		System.out.println("Test");
		System.out.println(pi);

	}

}
