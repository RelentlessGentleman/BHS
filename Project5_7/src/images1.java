import javax.swing.JOptionPane;

import images.APImage;
import images.Pixel;

public class images1 
{
	public static void main(String[] args)
	{

		APImage image = new APImage("res/smokey.jpg" );
		int x = image.getWidth();
		int y = image.getHeight();
		image.setSize(x,y);
		image.setTitle("Color to Black & White");
		for(Pixel pixel : image)
		{			
			int avg = (int)((pixel.getBlue() * .114) + (int)(pixel.getGreen() * .587) + (int)(pixel.getRed() * .299));
			pixel.setRed(avg);
			pixel.setBlue(avg);
			pixel.setGreen(avg);
		}
		image.draw();
	}
}