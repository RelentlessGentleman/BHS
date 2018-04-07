
public class SubString_Example {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String string = "Bensalem High School";
		String substring;
		
		System.out.println("Sting:" + string);
		substring = string.substring(1);
		System.out.println("String after 1st index: " +substring);
		
		substring = string.substring(0,8);
		System.out.println("Substring (0,8): " + substring);
		
	}

}
