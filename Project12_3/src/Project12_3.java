import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Project12_3 {

	public static void main(String[] args) throws FileNotFoundException {

		String file = "res/numbers.txt";
		Scanner inFile1 = new Scanner(new File(file));
		Scanner inFile2 = new Scanner(new File(file));
		Scanner keyboard = new Scanner(System.in);
		int array_length;
		array_length = count_Array_index(inFile1);

		int [] a = new int[array_length];
		//		print(a);// This method is responsible for the printing of each index of the UNSORTED UNASSIGNED array;
		assign(a,inFile2);
		sort(a);
		print(a);
		removeValue(a);
		InsertValue(a);
	}
	private static void InsertValue(int[] a) {

		if(a[0] != Integer.MIN_VALUE) System.out.println("Array is full, replacing index at 0 instead");
		System.out.println("Inserting an index");
		int number = specify();
		sort(a);
		a[0] = number;
		sort(a);
		print(a);
	}
	private static void removeValue(int[] a) {

		System.out.println("Removing an index");
		int number = specify();
		sort(a);
		a[LinearSearch(a, number)] = Integer.MIN_VALUE;
		sort(a);
		print(a);
		
	}
	private static int specify() {

		int number = -1;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter an index/number:\t");
		number = keyboard.nextInt();
		keyboard.nextLine();
		return number;
	}
	private static int LinearSearch(int[] a, int searchValue) {
		int left = 0;
		int right = a.length-1;
		int midpoint = (left+right)/2;
		d:while(left <= right){
			midpoint = (left+right)/2;
			if(a[midpoint] == searchValue){System.out.println("You've removed the index "+ searchValue);break d;}
			else if (a[midpoint] < searchValue) {left = midpoint+1;}
			else {right = midpoint-1;}
		}
		return midpoint;
	}

	
	static void sort(int[] a) {
		int w = -1;
		while(w < a.length){
			w++;
			for(int x = 0; x < a.length-1; x++){
				if (a[x] > a[x+1]){
					swap(a, x, x+1);
				}
			}
		}
	}
	static void assign(int[] a, Scanner inFile) {
		int token1;
		int counter = 0;
		while(inFile.hasNext()){
			token1 = inFile.nextInt();
			a[counter] = token1;
			counter++;

		}
	}
	private static int count_Array_index(Scanner inFile1) {
		int token1;
		int array_length = 0;
		while(inFile1.hasNext()){
			token1 = inFile1.nextInt();
			array_length++;
		}
		System.out.println("This array will have "+ array_length+ " indexies");
		return array_length;
	}
	public static void print(int[] a){
		String b = "";
		for(int x = 0; x < a.length; x++){
			if(a[x] == Integer.MIN_VALUE){}
			else{
			System.out.println(a[x]);
			}
		}
		System.out.println();
	}
	static void swap(int[]a, int x ,int y){
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}

}
