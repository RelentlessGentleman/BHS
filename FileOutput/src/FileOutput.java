import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class FileOutput {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		String name;
		String address;
		String phone;
		String major;
		int numFriends;
		
		PrintWriter outputFile = new PrintWriter("Fileoutput.csv");
		PrintWriter pw = new PrintWriter("LogFile.txt");
		
		Scanner keyboard = new Scanner(System.in);
		
		Scanner keybaord = new Scanner(System.in);
		
		System.out.print ("How many friends do you have? ");
		numFriends = keyboard.nextInt();
		pw.println(numFriends);
		
		keyboard.nextLine();
		
		for(int i = 1; i <= numFriends; i++)
		{
			System.out.print("Enter the name of friend " + "number " + i + ": ");
			pw.println("Enter the name of friend " + "number " + i + ": ");
			
			name = keyboard.nextLine();
			pw.println(name);
			
			System.out.print("Enter the address of friend " + "number " + i + ": ");
			pw.println("Enter the address of friend " + "number " + i + ": ");
			address = keyboard.nextLine();
			pw.println(address);
			
			System.out.print("Enter the phone number of friend " + "number " + i + ": ");
			pw.println("Enter the phone number of friend " + "number " + i + ": ");
			phone = keyboard.nextLine();
			pw.println(phone);
			
			System.out.print("Enter the school name of friend " + "number " + i + ": ");
			pw.println("Enter the major of friend " + "number " + i + ": ");
			major = keyboard.nextLine();
			pw.println(major);
			
			outputFile.println (name + "," + address +","+ phone +","+ major);
		}
		outputFile.close();
		pw.close();

	}

}
