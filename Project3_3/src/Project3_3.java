import java.util.Scanner;


public class Project3_3 {

	public static void main(String[] args) {
		double v;
		double m;
		double KE;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Input Velocity:");
		v = keyboard.nextDouble();
		System.out.println("Input Mass");
		m = keyboard.nextDouble();
		
		KE = .5 * m * (v*v);
		System.out.println(KE);

	}

}
