import java.util.Scanner;


public class Project13_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int input1;
		int input2;
		int counter;
		int answertest1;
		int answertest2;
		System.out.println("Please put in the first number: ");
		Scanner keyboard = new Scanner(System.in);
		input1 = keyboard.nextInt();
		System.out.println("Now the second number: ");
		input2 = keyboard.nextInt();
		if (input1 > input2)
		{
			counter = input2;
			while(counter != 0)
			{
				answertest1 = input1 % counter;
				answertest2 = input2 % counter;
				if (answertest2 == 0 && answertest1 == 0)
				{
					System.out.println("It's here 1");
					System.out.println(counter);
					break;
					
				}
				counter--;
			}
		}
		else if(input2 > input1)
		{
			counter = input1;
			while(counter != 0)
			{
				answertest1 = input1 % counter;
				answertest2 = input2 % counter;
				if (answertest2 == 0 && answertest1 == 0)
				{
					System.out.println("It's here 2");
					System.out.println(counter);
					break;
				}
				counter--;
			}
		}
		else
		{
			counter = input1;
			while(counter != 0)
			{
				answertest1 = input1 % counter;
				answertest2 = input2 % counter;
				if (answertest2 == 0 && answertest1 == 0)
				{
					System.out.println("It's here 3");
					System.out.println(counter);
					break;
				}
				counter--;
			}
		}
	}

}
