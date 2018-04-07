import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class LinearSearch {
	public static void main(String[] args) throws FileNotFoundException {
		
				String token1 = "";
				String dir = "res/randomWords.txt";
				Scanner inFile1 = new Scanner(new File(dir));
				Scanner inFile2 = new Scanner(new File(dir));
				int array_length = 0;
				while(inFile1.hasNext()){
					token1 = inFile1.nextLine();
					array_length++;
					System.out.println(token1 + "\t" +array_length);
				}
				String[] a = new String[array_length];
				array_length = 0;
				while(inFile2.hasNext()){
					a[array_length] = inFile2.nextLine();
					array_length++;
				}
				System.out.println("End of the array value assignement method");
				a = sort(a);

		showarray(a);

		int result = search(a, specify_value());
	}
	private static String specify_value() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter value:");
		String z = keyboard.nextLine();
		keyboard.close();
		return z;
	}
	private static void showarray(String[] a) {
		System.out.println();
		System.out.println("index\tvalue");
		for(int x = 0; x < a.length; x++){
			System.out.print(x + "\t");
			System.out.println(a[x]);
		}
		System.out.println();
	}
	static String[] sort(String[] a){
		String placeholder;
		int w = -1; //while loop counter;
		while(w < a.length+1){
			w++;
			for(int x = 0; x < a.length-1; x++){
				if (a[x].compareToIgnoreCase(a[x+1]) > 0){

					placeholder = a[x+1];
					a[x+1] = a[x];
					a[x] = placeholder;
				}
			}
		}
		return a;

	}
	static int search(String[] a, String searchValue){
		int left = 0;
		int right = a.length-1;
		int midpoint = (left+right)/2;
		while(left <= right){
			midpoint = (left+right)/2;
			if(a[midpoint].compareToIgnoreCase(searchValue) == 0)
			{
			//System.out.println();
			//System.out.println("Linear: " + midpoint);
			System.out.println();
			System.out.println("Binary: "+ midpoint);
			return midpoint;
			}
			else if (a[midpoint].compareToIgnoreCase(searchValue) < 0) 
			{
				left = midpoint+1;
				System.out.println("higher: " + midpoint);
			}
			else 
			{
				right = midpoint-1;System.out.println("lower: " + midpoint);
			}
		}
		System.out.println();
		//System.out.println("Linear: -1");
		System.out.println("Binary: -1");
		return -1;
	}
}

