import java.util.Scanner;


public class bankAccount {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		subClass toOtherClass = new subClass();
		
		double increase, decrease;
		String nameMain;
		double balance;
		int choice;
		String newName;
		double newBalance;
		
		System.out.println("Hello whoever you are, may I have a name for you?");
		nameMain = reader.nextLine();
		toOtherClass.setName(nameMain);
		
		System.out.println("How much money is in your balance?:");
		balance = reader.nextDouble();
		System.out.println("Withdraw: 1");
		System.out.println("Deposit: 2");
		choice = reader.nextInt();
		if (choice == 1)
		{
			System.out.println("Withdraw how much?");
			decrease = reader.nextDouble();
			toOtherClass.setWith(balance, decrease);
		}
		else
		{
			System.out.println("Deposit how much?");
			increase = reader.nextDouble();
			toOtherClass.setDep(balance, increase);
		}
		newName = toOtherClass.getName();
		newBalance = toOtherClass.getWith();
		System.out.println("Well "+newName);
		System.out.println("You have: "+newBalance+" left after this interaction!");
		
		

	}

}
