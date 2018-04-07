
public class Substring_Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "abc";
		String cde = "cde";
		String exampleA = " ";
		String exampleB = " ";
		
		System.out.println(str);
		System.out.println(str + cde);
		exampleA = "abc".substring(2,3);
		System.out.println(exampleA);
		
		
		exampleB = cde.substring(1, 3);
		System.out.println(exampleB);
		
	}

}
