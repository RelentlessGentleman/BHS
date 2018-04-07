import javax.swing.*;

import java.awt.*;
public class Project3_7 extends JPanel {
	
	public static void main(String[] args)
	{
		JFrame theGUI = new JFrame();
		theGUI.setTitle("Finding the center I guess");
		theGUI.setSize(300, 200);
		theGUI.setVisible(true);
		theGUI.getContentPane().add(new Project3_7());
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		int x = getWidth() / 2;
		int y = getHeight() / 2;
		g.drawString("x="+ x + ", y=" +y, x, y);
	}
		

	}


