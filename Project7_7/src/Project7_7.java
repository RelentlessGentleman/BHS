
public class Project7_7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int width = 0;
		int height = 0;
		int area;
		int peri;
		
		while(width <= 10)
		{
		
			
			while (height <= 10)
			{
				area = width*height;
				System.out.println("The area of a " + width + "x" + height+ " rectangle is: " + area);
				
				peri = width + height;
				System.out.println("The perimeter of a " + width + "x" + height+ " rectangle is: " + peri);
				System.out.println();
				height++;
			}
			width++;
			height = 0;
		}
	}

}


