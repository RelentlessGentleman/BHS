import java.util.Scanner;
public class Project8_2Example {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		Thermometer thermo = new Thermometer();
		String menu;
		int menuOption;
		
		menu = "\n1) Convert from Fahrenheit to Celsius" + "\n2) Convert from Celsius to Fahrenheit" + "\n3) Quit" + "\nEnter your option: ";
		
		menuOption = 4;
		while(menuOption != 3) {
			System.out.print(menu);
			menuOption = reader.nextInt();
			System.out.println("");
			
			if (menuOption==1) {
				System.out.print("Enter degrees Fahrenheit: ");
				thermo.setFahrenheit(reader.nextDouble());
				System.out.println("The equivalent in Celsius is " + thermo.getCelsius());
			}else if (menuOption==2){
				System.out.print("Enter degrees Celsius: ");
				thermo.setCelsius(reader.nextDouble());
				System.out.println("The equivalent in Fahrenheit is " + thermo.getFahrenheit());
			}else if (menuOption==3)
				System.out.println("Goodbye!");
			else
				System.out.println("Invalid option");
			}
		}
		// TODO Auto-generated method stub

	}


