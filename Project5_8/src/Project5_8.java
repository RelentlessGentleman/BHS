import javax.swing.JFrame;
import javax.swing.JOptionPane;
import images.APImage;
import images.Pixel;

public class Project5_8
{
	public static void main(String[] args)
	{
		
		int resize = Integer.parseInt(JOptionPane.showInputDialog("Enter the resize value: " ));	

		APImage image = new APImage("res/smokey.jpg");
		int x = image.getWidth() / resize;
		int y = image.getHeight() / resize;
		image.setSize(image.getWidth(),image.getHeight());
		image.setTitle("Big cat");
		image.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		APImage newImage = new APImage(x,y);
		for(int runY = 0; runY < y-1; runY++)
		{
			for(int runX = 0; runX < x; runX++)
			{
				Pixel getPixel = image.getPixel(runX * resize, runY * resize);
				newImage.setPixel(runX, runY, getPixel);
			}
		}
		image.draw();
		newImage.setSize(x,y);
		newImage.draw();
	}
}