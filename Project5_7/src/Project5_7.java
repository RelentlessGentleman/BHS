import javax.swing.JFrame;

import images.APImage;
import images.Pixel;

public class Project5_7
{
	public static void main(String[] args)
	{
		
		APImage image = new APImage("res/smokey.jpg" );
		int x = image.getWidth();
		int y = image.getHeight();
		image.setSize(x,y);
		image.setTitle("Smokeys looking...smokey heh heh");
		image.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		for(int runY = 1; runY < y-1; runY++)
		{
			for(int runX = 1; runX < x; runX++)
			{
				//System.out.println(runX + " " + runY);
				Pixel leftPixel = image.getPixel(runX - 1, runY);
				Pixel bottomPixel = image.getPixel(runX, runY + 1);
				Pixel upperPixel = image.getPixel(runX , runY - 1);
				Pixel rightPixel = image.getPixel(runX + 1, runY);				
				
				Pixel newPixel = image.getPixel(runX, runY);
				newPixel.setGreen((leftPixel.getRed() + bottomPixel.getRed() + upperPixel.getRed() + rightPixel.getRed()) / 4);
				newPixel.setBlue((leftPixel.getBlue() + bottomPixel.getBlue() + upperPixel.getBlue() + rightPixel.getBlue()) / 4);
				newPixel.setGreen((leftPixel.getGreen() + bottomPixel.getGreen() + upperPixel.getGreen() + rightPixel.getGreen()) / 4);
			}
		}
		image.draw();
	}
}